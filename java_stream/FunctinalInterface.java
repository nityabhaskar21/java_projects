package java_stream;

@FunctionalInterface
public interface FunctinalInterface
{
    public void greet();

    default void display() {
    }

    public static void staticGreet() {
    }
}
