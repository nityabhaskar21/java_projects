package java_stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap2 {
    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd", "bb");
        Map<String, Integer> map = givenList.stream()
                .collect(Collectors.toMap(Function.identity(), e -> 1, (item, identicalItem) -> item + identicalItem));
        System.out.println(map);
    }
}
