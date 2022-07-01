package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListCopy {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);

        List<Integer> l2 = new ArrayList<Integer>();
        l2 = l1; //Since we're copying references here, and not cloning the objects, 
                 //every amends made in one element will affect both lists.

        l2.add(2);

        System.out.println("l1 "+ l1);
        System.out.println("l2 "+ l2);
        // l1.forEach(System.out::println);
        // l2.forEach(System.out::println);


        
        //Copy the elements but amneds in one won't affect the other list
        List<Integer> l3 = new ArrayList<Integer>();
        l3.addAll(l1);
        l3.add(3);

        System.out.println("l1 "+ l1);
        System.out.println("l3 "+ l3);
        // l1.forEach(System.out::println);
        // l3.forEach(System.out::println);



        //Alternative for Copy the elements but amneds in one won't affect the other list
        List<Integer> l4 = l1.stream()
        .collect(Collectors.toList());

        l4.add(4);

        System.out.println("l1 "+ l1);
        System.out.println("l4 "+ l4);
        // l1.forEach(System.out::println);
        // l4.forEach(System.out::println);

    }
}
