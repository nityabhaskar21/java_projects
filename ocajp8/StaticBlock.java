package ocajp8;

public class StaticBlock {
    static {
        int x=10;
        z=x;
        final int h=20;
    }
    static int x;
    int y;
    static int z;
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(z);
    }
}
