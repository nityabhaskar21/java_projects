package java_new_features;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class UuidGenerator {
    public static void main(String[] args) {

        String providerAccountId= "730963009792";
        
        String cloudAccountId= "60c8293912f6f518065c2c3f";
        
        String region ="ap-northeast-1";
        
        var uuid =generateUUIDToken(cloudAccountId,providerAccountId,region);
        
        System.out.println("uuid: "+ uuid.toString());
        
        }
        
        
        public static UUID generateUUIDToken(String cloudAccountId, String providerAccountId, String region){
        
        String combine = String.format("%s:-:%s:-:%s", cloudAccountId, providerAccountId, region);
        
        byte[] byteArray = combine.getBytes(StandardCharsets.UTF_8);
        
        return UUID.nameUUIDFromBytes(byteArray);
        
        }
}
