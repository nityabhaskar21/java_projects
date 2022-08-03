package java_regex;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

// We can use the group in regular expressions to format text.

// For example, we can replace all 10-digit phone numbers in the input text by formatted phone numbers.

// In order to replace matched text we can use the replaceAll() method of the String class.

// Or we can use the replaceAll() method from Matcher class.

// $n, where n is a group number, inside replacement text refers to the matched text for group n.

// For example, $1 refers to the first matched group.

// The replacement text to replace the phone numbers with the formatted phone numbers will be ($1) $2-$3.

public class Regex_group_replace1 {
    public static void main(String[] args) { 
        // Prepare the regular expression 
        String regex = "\\b(\\d{3})(\\d{3})(\\d{4})\\b"; 
        String replacementText = "($1) $2-$3"; 
        String source = "1234567890, 1234567, and 0987654321"; 

        // Compile the regular expression 
        Pattern p = Pattern.compile(regex); 

        // Get Matcher object 
        Matcher m = p.matcher(source); 

        // Replace the phone numbers by formatted phone numbers 
        String formattedSource = m.replaceAll(replacementText); 

        System.out.printf("Text: %s%n", source ); 
        System.out.printf("Formatted Text: %s%n", formattedSource ); 
    } 
}
