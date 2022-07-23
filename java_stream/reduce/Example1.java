package java_stream.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Predicate;

// Given a list with string values, 
// remove all empty strings from list and return new list.

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
          .stream()
          .reduce(0, (subtotal, element) -> subtotal + element);

          System.out.println(result);

    }

    
}
