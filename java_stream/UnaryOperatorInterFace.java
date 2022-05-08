package java_stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

// This is a functional interface 
// and can therefore be used as the assignment target 
// for a lambda expression or method reference.

// @FunctionalInterface
// public interface UnaryOperator<T>
// extends Function<T,T>

// Represents an operation on a single operand that produces a result of the same type 
// as its operand. This is a specialization of Function for the case where 
// the operand and result are of the same type.

public class UnaryOperatorInterFace {
    public static void main(String[] args) {
        UnaryOperator<Integer> func = x -> x+7;

        int r1 = func.apply(6);
        System.out.println(r1);


        List<String> langList = new ArrayList<>();
        langList.add("Java");
        langList.add("C++");
        langList.add("JavaScript");
        langList.add("C#");

        System.out.println(langList);
        langList.replaceAll(ele -> ele.toUpperCase());  //UnaryOperator
        System.out.println(langList);

     }
}
