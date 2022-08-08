package java_stream.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

// BinaryOperator Extends BiFunction Interface i.e. BiFunction<T, T, T>
// BinaryOperator takes 2 operands of same time and return result of same type.
public class BinaryOperatorFunctionalInterface {
    public static void main(String[] args) {
        BinaryOperator<Integer> func = (x1, x2) -> x1*x2;
        int result = func.apply(20, 3);
        System.out.println(result);

        //Same using BiFunction , BiFunction can take and return any type of arguements. 
        BiFunction<String, String, Integer> func2 = (x1, x2) -> x1.length()*x2.length();
        int result1 = func2.apply("Hi", "There");
        System.out.println(result1);

    }
}
