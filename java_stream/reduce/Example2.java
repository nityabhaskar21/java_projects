package java_stream.reduce;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        lines = List.of("a", "b", "c", "d", "e", "f");

        String result = lines.stream().reduce("", (partialString, element) -> partialString+element) ;
        System.out.println(result);
    }
}
