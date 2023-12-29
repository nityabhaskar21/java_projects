package java_collections.string;

public class StringMatchRegex {
    public static void main(String[] args) {
        // a regex pattern for
        // five letter string that starts with 'a' and end with 's'
        String regex = "^a...s$";

        System.out.println("abs".matches(regex)); // false
        System.out.println("alias".matches(regex)); // true
        System.out.println("an abacus".matches(regex)); // false
        System.out.println("abyss".matches(regex)); // true

        // If we need need to use special characters such as: \, |, ^, *, + etc, we need to escape these characters. 
        // For example, we need to use \\+ to split at +
    }
}
