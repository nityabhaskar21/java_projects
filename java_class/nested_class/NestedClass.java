package java_class.nested_class;

public class NestedClass {

    private static class Inner {
        int i;

        Inner(int i) {
            this.i=i;
        }

        int getI() {
            return i;
        }

    }
    public static void main(String[] args) {
        Inner n = new Inner(10);
        System.out.println(n.getI());
    }
}
