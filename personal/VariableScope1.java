package personal;

public class VariableScope1 {
    static {
        x=5;
    }
    static int x;
    static int y;
    static {
        y=10;
    }

    {
        x=20;
    }
    public static void main(String[] args) {
        System.out.println(x); //5
        System.out.println(y); //10

        VariableScope1 V = new VariableScope1();
        System.out.println(x); //20
    }
}
