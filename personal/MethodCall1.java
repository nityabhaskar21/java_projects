package personal;

public class MethodCall1 {
    void m1(byte b, String s) {
        System.out.println("m1");
    }
    public static void main(String[] args) {
        MethodCall1 obj = new MethodCall1();
        // obj.m1(9, "");//compilation error as 9 is int
        obj.m1((byte)8, null); // correct
    }
}
