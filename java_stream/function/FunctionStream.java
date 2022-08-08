package java_stream.function;

import java.util.function.Function;

public class FunctionStream {
    public static void main(String[] args) {
        
        Function<String, Integer> f1 = x -> x.length();
        int len1 = f1.apply("Hello Thjere!");
        System.out.println(len1);

        Function<Integer, Integer> f2 = x -> x*2;

        int len2 = f1.andThen(f2).apply("Testing !!!");
        System.out.println(len2);

    }
}
