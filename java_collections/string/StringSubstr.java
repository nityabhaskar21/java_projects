package java_collections.string;

import java.util.Arrays;

public class StringSubstr {
    public static void main(String[] args) {
        // Substring Methods in Java
        // String class provides two forms of substring methods. They are as follows:

        // 1. public String substring(int startIndex): 
        // This method returns a new string that is a substring of this string
        String s1 = "India";
        String s2=s1.substring(3);
        System.out.println(s2); //ia


        // 2. public String substring(int startIndex, int endIndex): 
        // This method returns a new string of all the characters from starting index up to ending index 
        // but not including, the ending index
        String s3 = "India"; 
        String s4=s3.substring(1,3);
        System.out.println(s4); //nd


        String s5 = "HelloJava"; 
        String s6 = s5.substring(5); 
        System.out.println(s6); 
        
        String s7 = s5.substring(3, 9); // Java 
        System.out.println(s7); // loJava 


        // In Java, we can also use the split() method of String class to extract substrings 
        // from a given string object based on a specified delimiter.
        String text = "My name is Deepak. I am 26 years old. I live in Dhanbad.";

        // Split strings by the delimiter passed as an argument.
        String[] str = text.split("\\.");
                    
        // Display the extracted strings.
        System.out.println(Arrays.toString(str));
    }
}
