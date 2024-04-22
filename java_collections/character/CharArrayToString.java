package java_collections.character;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharArrayToString {
    public static void main(String[] args) {
        final char[] charArray = { 'b', 'a', 'e', 'l', 'd', 'u', 'n', 'g' };

        // String Constructor
        String string1 = new String(charArray);
        System.out.println(string1);

        // String.valueOf()
        String string2 = String.valueOf(charArray);
        System.out.println(string2);

        // StringBuilder‘s toString() and append(char[] arr)
        StringBuilder sb = new StringBuilder();
        sb.append(charArray);
        System.out.println(sb.toString());

        // Java 8
        final Character[] charArray1 = { 'b', 'a', 'e', 'l', 'd', 'u', 'n', 'g' };
        Stream<Character> charStream = Arrays.stream(charArray1);
        String string3 = charStream.map(String::valueOf).collect(Collectors.joining());
        System.out.println(string3);
    }
}
