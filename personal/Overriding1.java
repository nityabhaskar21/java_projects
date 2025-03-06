package personal;
class A {
    void m1() {
        System.out.println("A:M1");
    }
}
class B extends A {
    int m1() { //The return type is incompatible with A.m1()
        System.out.println("B:M1");
        return 1;
    }
}
public class Overriding1 {
    
}
