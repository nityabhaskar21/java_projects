package java_stream.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// This is a functional interface and can therefore be used 
// as the assignment target for a lambda expression or method reference.

// @FunctionalInterface
// public interface Predicate<T>

// Represents a predicate (boolean-valued function) of one argument.

public class PredicateInterface {
    public static void main(String[] args) {
        
        Predicate<Integer> func = x -> x>5;
        boolean res1 = func.test(9);
        System.out.println(res1);

        List<Integer> l1 = List.of(1, 3, 5, 8, 2);
        System.out.println(l1);

        //Filter takes predicate
        List<Integer> l2= l1.stream().filter(func).collect(Collectors.toList()); 
        System.out.println(l2);

        //Predicate with negate
        List<String> nameList = List.of("Nit", "Nitya", "Java", "C++");
        System.out.println(nameList);
        Predicate<String> func1 = x -> x.startsWith("Nit");
        List<String> nameList2 = nameList.stream()
                                        .filter(func1.negate()).collect(Collectors.toList());
        
        System.out.println(nameList2);                               



    }
}
