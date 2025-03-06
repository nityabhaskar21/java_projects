package personal;

class A {
    void f()throws Exception {
        System.out.println("A:f");
    }
}  
class B extends A {
    void f() throws Exception {
        System.out.println("B:f");
    }
}

public class Test5 {
    public static void main(String[] args) {
        try {
            A a = new B();
            a.f();
        } catch (Exception e) {
            System.out.println("E");
        }
    }
}
