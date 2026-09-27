package java_stream.functionalInterfaces.function;

@FunctionalInterface
public interface FunctinalInterface
{
    public void greet();

    default void display() {
    }

    public static void staticGreet() {
    }
}
