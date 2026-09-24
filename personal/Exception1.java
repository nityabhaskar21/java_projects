package personal;

import java.io.FileNotFoundException;
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

        try {
            m1();
        } catch (IOException E) { //VALID as m1 has throws IOException(or its child)
            System.out.println("E");
        }
    }

    static void m1() throws FileNotFoundException{
        System.out.println("M1");
    }
}
