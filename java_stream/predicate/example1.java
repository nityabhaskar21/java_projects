package java_stream.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Predicate;

// Given a list with string values, 
// remove all empty strings from list and return new list.

public class example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("basics");
        list.add("");
        list.add("andy");
        list.add("matt");
        list.add("");

        Predicate<String> predicate = (s) -> !s.isEmpty();

        List<String> newList = filterList(list, predicate);

        System.out.println(newList);
    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> newList =  new ArrayList<>();

        for (String s : list) {
            if (predicate.test(s)) {
                newList.add(s);
            }
        }
        return newList;
    }
}
