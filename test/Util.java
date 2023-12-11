package com.sify.cmp.order.util;

import static com.sify.cmp.order.enums.ErrorCode.REQUEST_PARAM_INVALID;
import static com.sify.cmp.order.enums.OrderSubStatus.BILLED;
import static com.sify.cmp.order.enums.OrderSubStatus.EXPIRED;
import static com.sify.cmp.order.enums.OrderSubStatus.IR_PARTIALLY_SIGNED;
import static com.sify.cmp.order.enums.OrderSubStatus.IR_SIGNED;
import static com.sify.cmp.order.enums.OrderSubStatus.OPEN;
import static com.sify.cmp.order.enums.OrderSubStatus.PARTIALLY_BILLED;
import static com.sify.cmp.order.util.Constants.CSV;
import static com.sify.cmp.order.util.Constants.DATE_FORMAT;
import static com.sify.cmp.order.util.ErrorMessageBuilder.constructErrorMessage;
import static com.sify.cmp.order.util.MongoConstants.ALL;
import static com.sify.cmp.order.util.MongoConstants.CI;
import static com.sify.cmp.order.util.MongoConstants.ERP;
import static com.sify.cmp.order.util.MongoConstants.FUSION;
import static org.apache.commons.lang3.StringUtils.containsAny;
import static org.apache.commons.lang3.StringUtils.equalsAnyIgnoreCase;
import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sify.cmp.order.domain.OrderItem;
import com.sify.cmp.order.domain.PurchaseOrderItem;
import com.sify.cmp.order.dto.OrderInactiveRequest;
import com.sify.cmp.order.enums.AccountType;
import com.sify.cmp.order.enums.OrderSource;
import com.sify.cmp.order.exception.InternalServerErrorException;
import com.sify.cmp.order.exception.InvalidRequestParameterException;

import feign.Response;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Util {

	public static final String MONTHLY = "Monthly";

	private Util() {
	}

	public static void validateClassificationInput(Map<String, String> apiMap, String orderSource, String accountType,
			String... args) throws InvalidRequestParameterException {
		List<String> errorList = new ArrayList<>();
		orderSourceValidation(orderSource, errorList);
		accountTypeValidation(errorList, accountType);
		fileFormatValidation(errorList, args);
		if (!errorList.isEmpty())
			throw new InvalidRequestParameterException(constructErrorMessage(apiMap, REQUEST_PARAM_INVALID, errorList));
	}
	
	public static void validateInactiveOrderRequest(OrderInactiveRequest orderInactiveRequest)
			throws InvalidRequestParameterException {
		final Pattern pattern = Pattern.compile("^(?=[a-zA-Z]).+");

		if (StringUtils.isEmpty(orderInactiveRequest.getRemarks())) {
			log.error("Remarks is required : {} ", orderInactiveRequest);
			throw new InvalidRequestParameterException("Remarks should not be empty.");
		}
		orderInactiveRequest.setRemarks(orderInactiveRequest.getRemarks().trim());

		if (!pattern.matcher(orderInactiveRequest.getRemarks()).matches()) {
			throw new InvalidRequestParameterException("Provided remarks are invalid, should start with alphabet");
		}
	}
	

	public static void validateOrderDescription(String input) throws InvalidRequestParameterException {
		final Pattern pattern = Pattern.compile("^(?=[a-zA-Z0-9]).+");

		if (StringUtils.isEmpty(input)) {
			log.error("Edit Description is empty : {} ", input);
			throw new InvalidRequestParameterException(
					"Description format not valid. Please provide a valid description");
		}
		if (!pattern.matcher(input.trim()).matches()) {
			log.error("Edit Description not valid : {} ", input);
			throw new InvalidRequestParameterException(
					"Description format not valid. Please provide a valid description");
		}
	}

	public static void validateInputForOrg(Map<String, String> apiMap, String fromDate, String toDate, String... args)
			throws InvalidRequestParameterException {
		List<String> errorList = new ArrayList<>();
		dateValidation(fromDate, toDate, errorList);
		fileFormatValidation(errorList, args);
		if (!errorList.isEmpty())
			throw new InvalidRequestParameterException(constructErrorMessage(apiMap, REQUEST_PARAM_INVALID, errorList));
	}

	public static void validateOrderBookedInput(Map<String, String> apiMap, String fromDate, String toDate,
			String orderSource, String... args) throws InvalidRequestParameterException {
		List<String> errorList = new ArrayList<>();
		dateValidation(fromDate, toDate, errorList);
		orderSourceValidation(orderSource, errorList);
		fileFormatValidation(errorList, args);
		if (!errorList.isEmpty())
			throw new InvalidRequestParameterException(constructErrorMessage(apiMap, REQUEST_PARAM_INVALID, errorList));
	}

	public static void validateFileFormat(Map<String, String> apiMap, String format)
			throws InvalidRequestParameterException {
		List<String> errorList = new ArrayList<>();
		if (!equalsIgnoreCase(format, CSV)) {
			var errMsg = String.format("Only CSV format is allowed : %s", format);
			log.error(errMsg);
			errorList.add(errMsg);
		}
		if (!errorList.isEmpty())
			throw new InvalidRequestParameterException(constructErrorMessage(apiMap, REQUEST_PARAM_INVALID, errorList));
	}

	public static Date formatFromDate(String fromDate) throws ParseException {
		if (StringUtils.isNotEmpty(fromDate)) {
			SimpleDateFormat sf = new SimpleDateFormat(DATE_FORMAT);
			Date startDate = sf.parse(fromDate);
			return startTime(startDate);
		}
		return null;
	}

	public static Date formatToDate(String toDate) throws ParseException {
		if (StringUtils.isNotEmpty(toDate)) {
			SimpleDateFormat sf = new SimpleDateFormat(DATE_FORMAT);
			Date endDate = sf.parse(toDate);
			return endTime(endDate);
		}
		return null;
	}

	private static Date startTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	private static Date endTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 59);
		return cal.getTime();
	}

	public static String dateToString(Date date) {
		if (ObjectUtils.isNotEmpty(date)) {
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			return dateFormat.format(date);
		}
		return "NA";
	}

	private static Object dateValidation(String fromDate, String toDate, List<String> errorList) {

		if ((isNotEmpty(fromDate) && isEmpty(toDate)) || isEmpty(fromDate) && isNotEmpty(toDate)) {
			var errMsg = "FromDate and toDate are required";
			log.error(errMsg);
			errorList.add(errMsg);
		}
		return errorList;

	}

	private static Object fileFormatValidation(List<String> errorList, String... strings) {
		if (strings.length != 0 && !equalsIgnoreCase(strings[0], CSV)) {
			var errMsg = String.format("Only CSV format is allowed : %s", strings[0]);
			log.error(errMsg);
			errorList.add(errMsg);
		}
		return errorList;
	}

	private static Object accountTypeValidation(List<String> errorList, String accountType) {
		if (!(accountType.equals(AccountType.EXTERNAL.toString) || accountType.equals(AccountType.INTERNAL.toString))) {
			var errMsg = "Account Type should be External or Internal";
			log.error(errMsg);
			errorList.add(errMsg);
		}
		return errorList;
	}

	private static Object orderSourceValidation(String orderSource, List<String> errorList) {
		if ((!equalsAnyIgnoreCase(orderSource, ERP, CI, ALL, FUSION))) {
			var errMsg = "Order source shall be ERP or CI or FUSION or ALL only";
			log.error(errMsg);
			errorList.add(errMsg);
		}
		return errorList;
	}

	public static void validateCategoryAndFileFormat(Map<String, String> apiMap, String category, String format) {
		List<String> errorList = new ArrayList<>();
		if (isBlank(category) || !containsAny(category, BILLED.toString(), OPEN.toString(), IR_SIGNED.toString(),
				EXPIRED.toString(), PARTIALLY_BILLED.toString(), IR_PARTIALLY_SIGNED.toString(), ALL)) {
			var errMsg = "Category shall be ALL or Billed or Open or IR_Signed or Expired or Partially_Billed";
			log.error(errMsg);
			errorList.add(errMsg);
		}
		fileFormatValidation(errorList, format);
		if (!errorList.isEmpty())
			throw new InvalidRequestParameterException(constructErrorMessage(apiMap, REQUEST_PARAM_INVALID, errorList));
	}

	public static void validateCategory(Map<String, String> apiMap, String category) {
		List<String> errorList = new ArrayList<>();
		if (isBlank(category) || !containsAny(category, BILLED.toString(), OPEN.toString(), IR_SIGNED.toString(),
				EXPIRED.toString(), PARTIALLY_BILLED.toString(), IR_PARTIALLY_SIGNED.toString(), ALL)) {
			var errMsg = "Category shall be Billed or Open or IR_Signed or Expired or Partially_Billed";
			log.error(errMsg);
			errorList.add(errMsg);
		}
		if (!errorList.isEmpty())
			throw new InvalidRequestParameterException(constructErrorMessage(apiMap, REQUEST_PARAM_INVALID, errorList));
	}

	public static void setServiceDurationTypeByOrderSource(OrderSource orderSource,
			List<PurchaseOrderItem> orderItems) {
		for (PurchaseOrderItem poi : orderItems) {
			if (OrderSource.CI.equals(orderSource)) {
				if ((MONTHLY).equals(poi.getCiProperties().getServiceDurationType())) {
					poi.getCiProperties().setServiceDurationType("Month(s)");
				} else {
					poi.getCiProperties().setServiceDurationType("Year(s)");
				}
			} else if (OrderSource.ERP.equals(orderSource) || OrderSource.FUSION.equals(orderSource)) {
				if ((MONTHLY).equals(poi.getErpProperties().getServiceDurationType())) {
					poi.getErpProperties().setServiceDurationType("Month(s)");
				} else {
					poi.getErpProperties().setServiceDurationType("Year(s)");

				}
			}
		}
	}

	public static void setServiceDurationType(List<OrderItem> orderItems) {
		for (OrderItem orderItem : orderItems) {
			if ((MONTHLY).equals(orderItem.getBillingPattern())) {
				orderItem.setServiceDurationType("Month(s)");
			} else {
				orderItem.setServiceDurationType("Year(s)");
			}
		}
	}

	public static Date convertStringToDate(String date, String source) throws ParseException {
		if (StringUtils.isBlank(date))
			date = new Date().toString();
		if (OrderSource.FUSION.toString().equals(source)) {
			DateFormat format = new SimpleDateFormat("yy-MM-DD hh:mm:ss", Locale.ENGLISH);
			return format.parse(date);
		}
		DateFormat format = new SimpleDateFormat("dd-MMM-yy hh:mm:ss", Locale.ENGLISH);
		return format.parse(date);
	}

	public static boolean isNullOrBlank(String str) {
		return (str == null || str.isBlank());
	}

	public static int convertStringtoInteger(String priceFiled) {
		if (StringUtils.isBlank(priceFiled)) {
			return 0;
		}
		var priceInDouble = Double.parseDouble(priceFiled);
		var priceInRound = String.valueOf(Math.round(priceInDouble));
		return Integer.parseInt(priceInRound);
	}
	
	public static Map<String, Integer> buildTagDefaultMap(List<String> tags){
		Map<String, Integer> tagMap = new LinkedHashMap<>();
		for(String tag : tags) {
			tagMap.put(tag, 0);
		}
		return tagMap;
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> extractListFromResponse(Response response) {
		ObjectMapper mapper = new ObjectMapper();
		List<String> userOrg;
		if (response.status() == 200) {
			try {
				userOrg = mapper.readValue(response.body().asInputStream(), List.class);
				log.info("fetched details from response successfully");
			} catch (IOException e) {
				log.error("Error while processing Iam service response : {}", e.getMessage());
				throw new InternalServerErrorException("Error while processing Iam service response");
			}
		} else {
			try {
				log.error("Status from IAM service : {}", response.status());
				Map<String, String> errorReponse = mapper.readValue((response.body().asInputStream()), Map.class);
				log.error("Error from IAM service : {}", errorReponse);
			} catch (IOException e) {
				log.error("Error while processing Iam service error response : {}", e.getMessage());
				throw new InternalServerErrorException("Error while processing Iam service error response");
			}
			throw new InternalServerErrorException("Unable to fetch user details, please try after sometime");
		}
		return userOrg;
	}
}
