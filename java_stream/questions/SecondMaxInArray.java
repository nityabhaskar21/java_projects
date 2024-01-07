package java_stream.questions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxInArray {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 7, 8};

        System.out.println("Numbers: " + Arrays.toString(array));

        int secondMax = Arrays.stream(array)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .limit(2)
                        .skip(1)
                        .findFirst()
                        .get();
        
        System.out.println("2nd max: " + secondMax);
    }
}
