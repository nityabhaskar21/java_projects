package java_collections.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistMaxMin {
    public static void main(String[] args) {
        Integer arr[] = {10, 324, 45, 90, 9808};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Largest in given array is " +Collections.max(list));
        System.out.println("Smallest in given array is " +Collections.min(list));
    }
}
