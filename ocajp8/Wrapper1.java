package ocajp8;

public class Wrapper1 {
    public static void main(String[] args) {
        Integer i = 3;
        i++;
        System.out.println(i);

        Double d = 3.0;
        // System.out.println(i==d); //compile time error

        int ii=2;
        Double dd=2.0;

        System.out.println(ii==dd); //true

        // System.out.println(i==d); //Compilation error

        Number n = 4;
        System.out.println(i==n); //true

        
        Integer i2=2;
        double d2=2.0;

        System.out.println(i2==d2); //true


    }
}
