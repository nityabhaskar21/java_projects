package java_new_features;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class UuidGenerator {

    public static void main(String[] args) {

        String cloudAccountId= "63db49a1a3a9b62cd66a312b";
        String providerAccountId= "757333951934";
        String region ="ap-south-1";

        var uuid =generateUUIDToken(cloudAccountId,providerAccountId,region);
        // var uuid =generateUUIDToken(providerAccountId,cloudAccountId,region);
        System.out.println("uuid: "+ uuid.toString());
    }
    
    
    public static UUID generateUUIDToken(String cloudAccountId, String providerAccountId, String region){
        String combine = String.format("%s:-:%s:-:%s", cloudAccountId, providerAccountId, region);
        byte[] byteArray = combine.getBytes(StandardCharsets.UTF_8);
        return UUID.nameUUIDFromBytes(byteArray);
    }
}
