package java_collections.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcat2 {
    public static void main(String[] args) {
        // There are some other techniques to concatenate or combine multiple strings in Java. 

        // 1. String Concatenation by using StringBuilder Class
        //The append() method can take arguments of different types, 
        // such as int, char, CharSequence, boolean, float, double, Objects, and StringBuilder.

        // Create a new StringBuilder object.	
        StringBuilder sb = new StringBuilder(); 

        // Call append() method to concatenate strings and other data types.
        sb.append("Hello, "); // Appending a string
        sb.append("Java!"); // Appending another string
        sb.append(2023); // Appending an integer
    
        // Convert the StringBuilder object to a String.
        String result = sb.toString();
        
        // Display the concatenated string
        System.out.println(result);     //Hello, Java!2023



        // 2. String Concatenation using format() Method
        String s1 = "Scientech";
        String s2 = " Easy";
        
        String s = String.format("%s%s",s1,s2);  
        System.out.println(s.toString());   //Scientech Easy



        // 3. String concatenation using String.join() method in Java 8 and Beyond
        String s3 = new String("Scientech");    
        String s4 = new String("Easy");   
        String s5 = String.join(" ", s3,s4);   
        System.out.println(s5.toString());      //Scientech Easy

        

        // 4. String concatenation using StringJoiner class in Java 8
        // Create a StringJoiner object with a delimiter.
        StringJoiner joiner = new StringJoiner(", "); 
            
        // Adding string elements to the StringJoiner.
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
            
        // Get the concatenated string
        String result2 = joiner.toString();
            
        // Display the concatenated string
        System.out.println("Concatenated String: " + result2);  //Concatenated String: Apple, Banana, Cherry



        //5. String concatenation using Collectors.joining() method in Java 8
        // Create a list of string array.	
        List<String> liststr = Arrays.asList("Apple", "Banana", "Orange"); 
    
        // Perform joining operation.	
        String result3 = liststr.stream().collect(Collectors.joining(", "));   
    
        // Display the result.   
        System.out.println(result3.toString()); //Apple, Banana, Orange
    }
}
