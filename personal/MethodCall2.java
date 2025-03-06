package personal;

public class MethodCall2 {
    void m1(int i) {System.out.println("m1");}
    void m1(Integer i) {System.out.println("m2");}

    public static void main(String[] args) {
        MethodCall2 obj = new MethodCall2();
        Integer i = 7;
        
        obj.m1(i);//m2

        obj.m1(7);//m1
        
    }
}
