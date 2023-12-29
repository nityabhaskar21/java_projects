package java_collections.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Arrays1 {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40};
        String[ ] cities = {"Dhanbad", "New York", "Delhi" };

        myNum[0] = 15;
        System.out.println(myNum.length);   //4
        System.out.println(myNum);   //[I@36baf30c] i.e. reference
        System.out.println(cities);  //[Ljava.lang.String;@7a81197d]

        // List asList(): The asList() method returns a fixed-size list that is backed by the specified array.
        System.out.println(Arrays.asList(cities));  //[Dhanbad, New York, Delhi]
        System.out.println(Arrays.asList(myNum));   //[I@36baf30c]

        List<String> arrStr = new ArrayList<>(Arrays.asList(cities));
        System.out.println("arrStr: "+Arrays.asList(arrStr));  //[[Dhanbad, New York, Delhi]]

        //Error since muNum is of primitive type int
        // List<Integer> arrNum = new ArrayList<>(Arrays.asList(myNum)); 
        //Instead use
        List<Integer> list1 = Arrays.stream(myNum).boxed().collect(Collectors.toList());
        //boxed() Returns a Stream consisting of the elements of this stream, each boxed to an Integer in this case.

        // OR 
        List<Integer> list2 = IntStream.of(myNum) // return Intstream
                                .boxed()        // Stream<Integer>
                                .collect(Collectors.toList());

        System.out.println(list1);   //[15, 20, 30, 40]
    }
}
