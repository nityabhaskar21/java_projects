package personal;

public class EqualsWrapper {
    public static void main(String[] args) {
        Integer i = 10;
        Double d = 10.0;

        // System.out.println(i==d); //Incompatible operand types Integer and Double

        System.out.println(i==10); //true

        System.out.println(d==10); //true

        System.out.println(i.equals(10)); //true

        System.out.println(i.equals(d));  //false

    }
}
