package ocajp8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("caught");
        }
    }

    public static IOException method() {
        try {
            return new IOException();
        } catch (FileNotFoundException e) {
            return new FileNotFoundException();
        }
    }
}

