package ocajp8;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    final void method() throws FileNotFoundException{
        System.out.println("A B");
    }
    
}
class B extends A {
    // @Override
    void method(int a) throws NullPointerException{
        System.out.println("C D");
    }
}
public class InheritanceFinal1 {
    public final static void main(String[] args) throws IOException {
        A a = new B();
        a.method();

        B b = new B();
        b.method();
    }
}
