package java_regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;


public class regex {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";

        //abc abc
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE/* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
       
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                System.out.println("m.group():"+ m.group());
                input = input.replaceAll(/* The regex to replace */regex, /* The replacement. */m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        
        
        in.close();
    }
    
}
