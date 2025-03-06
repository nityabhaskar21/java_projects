package ocajp8;

public class FloatNumber {
    public static void main(String[] args) {
        float f1 = 1;
        float f2 = f1/0;
        System.out.println(f2); //Nan or infinity

        double d1 = 1;
        double d2 = d1/0;
        System.out.println(d2); //Nan or infinity

        int n1 = 5/0; //ArithmeticException
        System.out.println(n1);
        // char c=65535;

        int i=10;
        short s=(short)i;
    }
}
