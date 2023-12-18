package java_collections.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l=Arrays.asList(4, 7, 2, 9, 7, 8);

        //descending order using comparator
        Collections.sort(l, (a,b) -> b-a);  

        //ascending order
        // Collections.sort(l);  

        System.out.println(l);
    }
}
