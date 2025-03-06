package ocajp8;

import java.io.IOException;

public class Exception2 {
    public static void main(String[] args) {
        try {
            new Exception2().meth();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void meth() throws IOException {
        System.out.println("Hi");
    }
}
