package java_stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class toMap3 {
    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd", "bb");
        Map<String, Integer> map = givenList.stream()
                                    .collect(
                                        Collectors.toMap(
                                            Function.identity(), 
                                            e -> 1, 
                                            (item, identicalItem) -> item+identicalItem, 
                                            TreeMap::new));
        System.out.println(map);
    }
}
