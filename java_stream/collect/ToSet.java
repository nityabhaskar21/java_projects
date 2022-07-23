package java_stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSet {
    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd", "bb");
        Set<String> result = givenList.stream().collect(Collectors.toSet());

        System.out.println(result);
    }
}
