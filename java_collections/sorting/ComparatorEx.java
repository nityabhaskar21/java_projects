package java_collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(61);
        numbers.add(28);
        numbers.add(83);
        numbers.add(55);

        //sort numbers according to lasst digit
        Comparator<Integer> comparator = (Integer i, Integer j) -> i%10 > j%10?1:-1;

        Collections.sort(numbers, comparator);

        System.out.println(numbers);

    }
}
