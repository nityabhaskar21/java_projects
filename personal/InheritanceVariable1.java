package personal;
class A {
    int i=10;
    static int s = 20;
    final int f = 30;
    static final int sf = 40;

    void m() {
        System.out.println(i);  
        System.out.println(s);  
        System.out.println(f);  
        System.out.println(sf); 
    }
}

class B extends A {
    void m1() {
        System.out.println(i);  
        System.out.println(s);  
        System.out.println(f);  
        System.out.println(sf); 
    }
}

public class InheritanceVariable1 {
    public static void main(String[] args) {
        B b = new B();
        b.m1(); //10 20 30 40
        b.i++;
        b.s++;
        // b.f++; //error
        // b.sf++; //error

        System.out.println();
        
        A a = new A();
        a.m(); //10 21 30 40
    }
}
