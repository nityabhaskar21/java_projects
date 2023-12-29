package java_collections.string;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "Learn Kolin";
        int result;

        // comparing str1 with str2
        result = str1.compareTo(str2);

        System.out.println(result); //-1

    //     compareTo() Return Value
    //     returns 0 if the strings are equal
    //     returns a negative integer if the string comes before the str argument in the dictionary order
    //     returns a positive integer if the string comes after the str argument in the dictionary order
    
        boolean result1 = str1.equals(str2);
        System.out.println(result1);    //false
    }
}
