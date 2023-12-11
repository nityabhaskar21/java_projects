package com.sify.cmp.order.service;

import static com.sify.cmp.order.util.Constants.COUNT;
import static com.sify.cmp.order.util.Constants.SYSTEM_TAGS;
import static com.sify.cmp.order.util.Constants.TAGS;
import static com.sify.cmp.order.util.Constants._ID;
import static com.sify.cmp.order.util.Util.buildTagDefaultMap;
import static com.sify.cmp.order.util.Util.extractListFromResponse;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sify.cmp.api.guard.domain.UserInfo;
import com.sify.cmp.order.domain.Organization;
import com.sify.cmp.order.dto.CloudDetail;
import com.sify.cmp.order.enums.CloudProvider;
import com.sify.cmp.order.exception.InternalServerErrorException;
import com.sify.cmp.order.exception.ResourceConflictException;
import com.sify.cmp.order.exception.ResourceNotFoundException;
import com.sify.cmp.order.repo.OrganizationRepo;
import com.sify.cmp.order.repo.OrganizationTagRepo;
import com.sify.cmp.order.service.client.IamServiceClient;

import feign.Response;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrganizationService {

	@Autowired
	OrganizationRepo orgRepo;

	@Autowired
	OrganizationTagRepo organizationTagsRepo;
	
	@Autowired
	IamServiceClient iamServiceClient;

	public Organization getOrganization(String orgId) {
		return orgRepo.getOrganization(orgId).orElseThrow(() -> {
			var errMsg = String.format("Organization doesn't exists with the id : %s", orgId);
			log.error(errMsg);
			return new ResourceNotFoundException(errMsg);
		});
	}

	// cloudSub method
	public List<CloudDetail> getCloudSubscriptions(String orgId, boolean includingSify) {
		log.info("Get Cloud Subscriptions for orgId {}", orgId);
		var organization = getOrganization(orgId);
		var clouds = organization.getClouds();
		if (CollectionUtils.isEmpty(clouds)) {
			log.info("organization doesn't have cloud subscriptions");
			return List.of();
		}
		if (!includingSify) {
			return clouds.stream().filter(cloud -> !(cloud.getProvider().equals(CloudProvider.sify))
					&& !(cloud.getProvider().equals(CloudProvider.sifylite))).collect(Collectors.toList());
		}
		return clouds;
	}

	public List<String> getPortalFeatures(String orgId) {
		var org = orgRepo.findPortalFeaturesInOrg(orgId);
		if (org.isPresent()) {
			log.info("Portal Features for org {} {} ", org.get().getOrgName(), org.get().getPortalFeatures());
			return org.get().getPortalFeatures();
		}
		return List.of();
	}

	public Map<String, Object> getCloudProviderCount() {
		var getCloudProvider = orgRepo.getCloudProviderSumary();
		log.info("\n\n getCloudProvider: {}", getCloudProvider);
		Map<String, Object> map = new HashMap<>();
		getCloudProvider.stream().forEach(providerMap -> {
			map.put(providerMap.get("_id").toString(), providerMap.get("count"));
		});
		log.info("\n getCloudProvider: {}", map);
		List<String> providersList = List.of("sify", "aws", "oci", "gcp", "azure");
		Map<String, Object> providerCountMap = new LinkedHashMap<>();
		for (String key : providersList) {
			providerCountMap.put(key, map.getOrDefault(key, 0));
		}
		log.info("\n providerCountMap: {}", providerCountMap);
		return providerCountMap;
	}

	public Map<String, Object> getOrgSummaryByAccountType() {

		var getOrgs = orgRepo.getOrgSumaryAccountType();
		Map<String, Object> map = new TreeMap<>();
		log.info("\n getOrgs based on accountType: {}", getOrgs);
		getOrgs.stream().forEach(providerMap -> {
			map.put(providerMap.get("_id").toString(), providerMap.get("count"));
		});
		log.info("\n getOrgs based on accountType: {}", map);
		return map;
	}

	public List<String> getOrganizationTags() {
		return organizationTagsRepo.getOrganizationTags();
	}

	public List<String> getOrganizationTagsByOrgId(String orgId) throws ResourceNotFoundException {
		log.info("Fetching Organization tags for orgId : {}", orgId);
		Organization org = getOrganization(orgId);
		if (!CollectionUtils.isEmpty(org.getTags())) {
			return org.getTags();
		}
		return List.of();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void updateOrganizationTags(String orgId, Map<String, Object> tagsMap) throws ResourceConflictException {
		Organization org = getOrganization(orgId);
		if (!ObjectUtils.isEmpty(tagsMap) && tagsMap.containsKey(TAGS)) {
			List<String> tagsList = (List) tagsMap.get(TAGS);
			log.info("Updating Organization: {} with tags: {}", org, tagsList);
			Map<String, Object> errorMap = new HashMap<>();
			validateOrgTags(tagsList, errorMap);
			if (errorMap.size() > 0) {
				log.error("Validation Failure in Updating Organization tags {}", errorMap);
				throw new ResourceConflictException(errorMap);
			}
			orgRepo.updateOrganizationTags(orgId, tagsList, TAGS);
		} else {
			throw new ResourceConflictException("Error in updating organization-tags: ");
		}
	}

	private void validateOrgTags(List<String> tags, Map<String, Object> errorMap) {
		if (!CollectionUtils.isEmpty(tags)) {
			List<String> orgTagsList = getOrganizationTags();
			if (!orgTagsList.containsAll(tags)) {
				var errMsg = "Invalid Tag";
				errorMap.put(TAGS, errMsg);
			}
		}
	}

	public Map<String, Object> getOrganizationTagSummary() {
		Map<String, Object> tagSummary = new LinkedHashMap<>();
		tagSummary.put(TAGS, buildTagDefaultMap(organizationTagsRepo.getOrganizationTags()));
		tagSummary.put(SYSTEM_TAGS, buildTagDefaultMap(organizationTagsRepo.getOrganizationSystemTags()));
		tagSummary.put("total_org", orgRepo.getActiveOrgCount());
		updateTagCountFromDb(tagSummary);
		return tagSummary;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map<String, Object> updateTagCountFromDb(Map<String, Object> tagSummary) {
		List<Map> organizationSummary = orgRepo.getOrganizationSummary(TAGS);
		Map<String, Integer> tagMap = (Map<String, Integer>) tagSummary.get(TAGS);
		organizationSummary.stream().forEach(tagCountMap -> {
			tagMap.put(tagCountMap.get(_ID).toString(), (Integer) tagCountMap.get(COUNT));
		});
		tagSummary.put(TAGS, tagMap);
		organizationSummary = orgRepo.getOrganizationSummary(SYSTEM_TAGS);
		Map<String, Integer> sysTagMap = (Map<String, Integer>) tagSummary.get(SYSTEM_TAGS);
		organizationSummary.stream().forEach(tagCountMap -> {
			sysTagMap.put(tagCountMap.get(_ID).toString(), (Integer) tagCountMap.get(COUNT));
		});
		tagSummary.put(SYSTEM_TAGS, sysTagMap);
		return tagSummary;
	}

	public List<Organization> getOrganizationsForUser(String filter, String status, UserInfo userInfo) {
		List<String> userOrgIdList = getOrgsforUser(userInfo);
		log.info("User org List : {}",userOrgIdList);
		if (CollectionUtils.isEmpty(userOrgIdList)) {
			throw new ResourceNotFoundException("No Organizations found for the user");
		}
		if (userOrgIdList.contains("*")) {
			return orgRepo.getOrganizations(filter, status, List.of());
		}
		return orgRepo.getOrganizations(filter, status, userOrgIdList);
	}

	private List<String> getOrgsforUser(UserInfo userInfo) {
		Response response = null;
		try {
			response = iamServiceClient.getOrganizationListForUser(userInfo.getUserName(), userInfo.getUserType());
			log.info("Status from IAM service : {}", response.status());
		} catch (Exception e) {
			log.error("Error while trying to call IAM Service : {}", e.getMessage());
			throw new InternalServerErrorException("Unable to fetch user details from IAM, please try after sometime");
		}
		return extractListFromResponse(response);
	}
	
}
