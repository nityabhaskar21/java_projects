package java_stream.stream_on_map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GetMapValues {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("name", "abc");
        map.put("class", "four");
        map.put("job", "student");
        map.put("father", "xyz");

        var list = map.entrySet().stream().map(m -> m.getValue()).collect(Collectors.toList());
        System.out.println(list);
    }
}
