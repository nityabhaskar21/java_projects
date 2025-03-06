package personal;

import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        try {
            System.out.println("Hi");
        } catch (Exception e) { //Valid
            System.out.println("e");
        }

        // try {
        //     System.out.println("Hi2");
        // } catch (IOException E) { //iNVALID
        //     System.out.println("E");
        // }
    }
}
