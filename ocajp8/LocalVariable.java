package ocajp8;

public class LocalVariable {
    static int x=20;

    public static void main(String[] args) {
        System.out.println(x);
        final int x=10;
        System.out.println(x);

    }
}
