package java_collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class map_maintain_order {
    public static void main(String[] args) {
        Map<String , Object> map = new LinkedHashMap<>();
        map = Map.of("first", 1, "second", 2, "third", 3);

        map.forEach((key, value) -> {
            System.out.println("Key: " +key+ " Value: "+value);
        });
    }
}
