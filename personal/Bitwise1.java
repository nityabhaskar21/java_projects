package personal;
public class Bitwise1 {
    public static void main(String[] args) {
        int i=2;

        // if (i&5);  //cannot convert from int to boolean

        if (i<5&i++==2) System.out.println("Works");
    }
}
