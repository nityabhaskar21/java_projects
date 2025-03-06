package ocajp8;

class Type {
    static void m1(long n) {System.out.println("first");}
    static void m1(Integer n) {System.out.println("second");}
}
public class OverloadTypes1 {
    public static void main(String[] args) {
        int i=10;
        Type.m1(i);
    }
}
