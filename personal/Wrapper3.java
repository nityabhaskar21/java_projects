package personal;

public class Wrapper3 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(300);
        Integer i2 = Integer.valueOf(300);

        System.out.println(i1==i2); //false


        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Integer i5 = Integer.valueOf(100);

        System.out.println((i3==i4)+" "+(i4==i5)); //true true

        Double d = new Double(10);
        System.out.println(d); //10.0
    }
}
