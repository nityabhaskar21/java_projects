package ocajp8;

import java.io.IOException;

public class ExceptionThrows1 {
    public static void main(String[] args) {
        f1();
    }

    static void f1() throws IOException{
        System.out.println("f1");
        try {
            System.out.println("Inside try");
            // throw new IOException();
        } catch(NullPointerException e) {
            System.out.println("Catch null");
            throw new IOException();
        } catch (IOException e) {
           System.out.println("inside catch Ioexception");
        } finally {

        } 
    }
}
