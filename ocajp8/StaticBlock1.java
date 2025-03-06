package ocajp8;

public class StaticBlock1 {
    static {
        System.out.println("Without main");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("From main");
    }
}
