package java_collections.string;

public class StringValueOf {
    public static void main(String[] args) {
        //The valueOf() method returns the string representation of the argument passed.
        int a = 5;
        long l = -2343834L;
        float f = 23.4f;
        double d = 923.234d;

        // convert numbers to strings
        System.out.println(String.valueOf(a));  // "5"
        System.out.println(String.valueOf(l));  // "-2343834"
        System.out.println(String.valueOf(f));  // "23.4"
        System.out.println(String.valueOf(d));  // "923.234"


        char c = 'J';
        char ch[] = {'J', 'a', 'v', 'a'};
        int ch1[] = {5, 8};

        // convert char to string
        System.out.println(String.valueOf(c));  // "J"

        // convert char array to string
        System.out.println(String.valueOf(ch));  // "Java"
        System.out.println(String.valueOf(ch1));  // [I@3fee733d]
    }
}
