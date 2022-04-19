package java_io;
import java.io.Console;

public class console_read {
    public static void main(String[] args) {
        Console console = System.console();
        String s = console.readLine("%nEnter your text: ");
        System.out.println(s);
    }
}


