package java_regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

// Lookarounds
// Lookaround	Legend	Example	Sample Match
// (?=…)	Positive lookahead	(?=\d{10})\d{5}	01234 in 0123456789
// (?<=…)	Positive lookbehind	(?<=\d)cat	cat in 1cat
// (?!…)	Negative lookahead	(?!theatre)the\w+	theme
// (?<!…)	Negative lookbehind	\w{3}(?<!mon)ster	Munster


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
