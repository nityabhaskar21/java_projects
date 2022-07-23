package java_stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {
    

    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd", "bb");
        Map<String, Integer> map = givenList.stream()
                                    .collect(Collectors.toMap(Function.identity(), e -> e.length(), (item, identicalItem) -> item));
        System.out.println(map);
    }
}
