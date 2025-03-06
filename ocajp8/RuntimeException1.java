package ocajp8;

public class RuntimeException1 {
    public static void main(String[] args) {
        try {
            f();
            System.out.println("Hi");
        } catch (Exception e) {

        }
    }

    public static void f() {
        throw new RuntimeException();
    }
}
