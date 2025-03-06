package personal;

public class MethodCall3 {
    void m1(Byte b) {System.out.println("Byte");}
    void m1(Integer b) {System.out.println("Integer");}
    void m1(int i) {System.out.println("int");}
    public static void main(String[] args) {
        Byte b = 3;
        MethodCall3 obj = new MethodCall3();
        obj.m1(b); //Byte

        obj.m1((byte)2); //int
    }
}
