package java_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_ex1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(3, 1, 4, 5, 2);
        List<String> words = List.of("apple", "banana", "kiwi");
        

        //1. Find the Sum of All Elements in a List
        int [] list1 = {3, 6, 6, 8, 10};
        int sum1 = Arrays.stream(list1).sum();
        System.out.println("1. sum1: "+ sum1); //sum1: 33


        //1.1 Find the Sum of All Elements in a ArrayList
        List<Integer> arrList1 = Arrays.asList(3, 6, 6, 8, 10);
        int sum1_1 = arrList1.stream().mapToInt(Integer::intValue).sum();
        System.out.println("1.1 sum1_1: "+ sum1_1); //sum1_1: 33


        //2. Find the Product of All Elements in a List
        List<Integer> arrList2 = List.of(1, 2, 3, 4, 5);
        int product1 = arrList2.stream().reduce(1, (a, b)-> a*b); //product1: 120
        System.out.println("2. product1: "+product1);


        //3. Find the Average of All Elements in a List
        double avg1 = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("3. avg1: "+avg1); //avg1: 3.0
        

        //4. Find the Maximum Element in a List
        int max1 = list.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        int max2 = list.stream().max(Integer::compare).orElse(0); //Alternative
        System.err.println("4. max1: "+ max1+", max2: "+ max2); //max1: 5, max2: 5


        //5. Find the Minimum Element in a List
        int min1 = list.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
        int min2 = list.stream().min(Integer::compare).orElse(Integer.MAX_VALUE); //Alternative
        System.out.println("5. min1: "+min1+", min2: "+min2 ); //min1: 1, min2: 1


        //6. Count the Number of Elements in a List
        long count1 = list.stream().count();
        System.out.println("6. count1: "+count1); //count1: 5


        //7. Check if a List Contains a Specific Element
        boolean contains1 = list.stream().anyMatch(ele->ele==4);
        System.out.println("7. contains1: "+contains1); //contains1: true


        //8. Filter Out Even Numbers from a List
        List<Integer> evenNumbers = list.stream().filter(ele -> (ele&1)==0).collect(Collectors.toList());
        System.out.println("8. evenNumbers: "+evenNumbers); //evenNumbers: [4, 2]


        //9. Filter Out Odd Numbers from a List
        List<Integer> oddNumbers = list.stream().filter(ele-> (ele&1)==1).collect(Collectors.toList());
        System.out.println("9. oddNumbers: "+oddNumbers); //oddNumbers: [3, 1, 5]


        //10. Convert a List of Strings to Uppercase
        List<String> words1 = List.of("world", "hello");
        List<String> upperCaseWords = words1.stream().map(String::toUpperCase).toList();
        System.out.println("10. uppperCaseWords: "+upperCaseWords); //uppperCaseWords: [WORLD, HELLO]


        //11. Convert a List of Integers to Their Squares
        List<Integer> squareList = list.stream().map(e->e*e).toList();
        System.out.println("11. squareList: "+squareList); //squareList: [9, 1, 16, 25, 4]


        //12. Find the First Element in a List
        int firstElement = list.stream().findFirst().orElse(-1);
        System.out.println("12. firstElement: " +firstElement); //firstElement: 3


        //13. Find the Last Element in a List
        int lastElement = list.stream().reduce((a, b)->b).orElse(-1);
        System.out.println("13. lastElement: "+lastElement); //13. lastElement: 2


        //14. Check if All Elements in a List Satisfy a Condition
        //check if all elements are even
        boolean satisfyAll = list.stream().allMatch(e->e%2==0);
        System.out.println("14. All even elements: "+satisfyAll); //14. All even elements: false


        //15. Check if Any Element in a List Satisfies a Condition
        //check if any even is present
        boolean satisfyAny = list.stream().anyMatch(e->e%2==0);
        System.out.println(("15. Any even element: "+satisfyAny)); //15. Any even element: true\


        //16. Remove Duplicate Elements from a List
        List<Integer> numbers = List.of(2, 1, 2, 2, 3, 4, 4);
        List<Integer> uniqueNumbers = numbers.stream().distinct().toList();
        System.out.println("16. Unique numbers: "+ uniqueNumbers); //16. Unique numbers: [2, 1, 3, 4]


        //17. Sort a List of Integers in Ascending Order (and return new list)
        List<Integer> sortedList1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("17. sortedList: "+sortedList1); //17. sortedList: [1, 2, 3, 4, 5]


        //18. Sort a List of Integers in Descending Order (and return new list)
        List<Integer> sortedList2 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("18. reverseSortedList: "+sortedList2); //18. reverseSortedList: [5, 4, 3, 2, 1]


        //19. Sort a List of Strings in Alphabetical Order
        List<String> words2 = List.of("banana", "apple", "cherry");
        List<String> sortedWords1 = words2.stream().sorted().collect(Collectors.toList());
        System.out.println("19. sortedByAlplabet: "+sortedWords1); //19. sortedByAlplabet: [apple, banana, cherry]


        //20. Sort a List of Strings by Their Length
        List<String> words3 = List.of("apple", "banana", "kiwi");
        List<String> sortedWords2 = words3.stream()
                                    .sorted(Comparator.comparingInt(String::length))
                                    .collect(Collectors.toList());
        System.out.println("20. sortedByLength: " + sortedWords2); //20. sortedByLength: [kiwi, apple, banana]



    }
}
