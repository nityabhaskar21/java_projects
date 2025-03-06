package ocajp8;

public class IncDec {
    public static void main(String[] args) {
        int i;
        // static int j=0; //compiler error, only final is permitted
        if (true) i=10;
        System.out.println();
        System.out.println(i);
        System.err.println(i++ + --i + i);
    }
}
