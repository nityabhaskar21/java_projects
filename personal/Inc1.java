package personal;

public class Inc1 {
    public static void main(String[] args) {
        int i=0;

        i+=i++ + ++i + i++ + ++i;
        System.out.println(i); //8


        int x=10;
        x=++x;
        x=++x;
        System.out.println(x); //12

        x=10;
        x=x++;
        x=x++;
        System.out.println(x); //10
    }
}
