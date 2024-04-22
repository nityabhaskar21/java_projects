package java_collections.character;

public class IntToIntegerChar {
    public static void main(String[] args) {
        //Works for single digit
        int num1=8;
        char ch1=(char)(num1+'0');
        System.out.println(ch1);


        // doesn't work here
        int num2=16;
        char ch2=(char)(num2+'0');
        System.out.println(ch2);
    }
}
