package java_stream;

import java.util.function.Supplier;

// This is a functional interface and can therefore 
// be used as the assignment target for a lambda expression or method reference.

// It takes no arguement and return result;

public class SupplierInterface {
    public static void main(String[] args) {
        getText(() -> "hi there");
        getText(() -> "hi there2");
    }

    public static void getText(Supplier<String> s1) {
        System.out.println(s1.get().length());
    }
}
