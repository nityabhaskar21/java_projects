package java_stream.questions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxInArrayWithDuplicates {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 7, 8, 9, 9};

        System.out.println("Numbers: " + Arrays.toString(array));

        int secondMax = Arrays.stream(array)
                        .boxed()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .limit(2)
                        .skip(1)
                        .findFirst()
                        .get();
        
        System.out.println("2nd max: " + secondMax);
    }
}
