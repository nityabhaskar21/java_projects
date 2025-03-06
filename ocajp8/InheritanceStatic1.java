package ocajp8;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    static void method() throws FileNotFoundException{
        System.out.println("A B");
    }
    
}
class B extends A {
    // @Override
    static void method() throws NullPointerException{
        System.out.println("C D");
    }
}
public class InheritanceStatic1 {
    public final static void main(String[] args) throws IOException {
        A a = new B();
        A.method();
        // char ch = 700;
        // System.out.println(ch);
        // int True = 6;
        // // byte b = 66;
        // char c = 65535;

        B b = new B();
        B.method();
    }
}
