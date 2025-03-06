package ocajp8;

public class Sysout2Datetype {
    public static void main(String[] args) {
        Long l1=9l;
        Long l2=9l;

        System.out.println(l1==l2); //true

        Long l3=900l;
        Long l4=900l;

        System.out.println(l3==l4); //false

        Float f1=9f;
        Float f2=9f;

        System.out.println(f1==f2); //false

        Number n1=9l;
        Integer i1=9;

        System.out.println(n1==i1); //false as number is long now

        Number n2=9;
        Integer i2=9;

        System.out.println(n2==i2); //true

        Integer n3=9;
        Object o1=9;

        System.out.println(n3==o1); //true
    }
}
