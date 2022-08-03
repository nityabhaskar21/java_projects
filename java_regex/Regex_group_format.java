package java_regex;

import java.util.regex.Pattern; 
import java.util.regex.Matcher; 

// Groups can be used to format or replace the matched string with another string.

// Suppose we want to format all 10-digit phone numbers as (xxx) xxx -xxxx, where an x denotes a digit.

// The phone number is in three groups:

// the first three digits,
// the next three digits, and
// the last four digits.
// We can create a regular expression using three groups so we can refer to the three matched groups by their group numbers.

// The regular expression would be \b(\d{3})(\d{3})(\d{4})\b.

// The \b in the beginning and in the end denotes that you are interested in matching ten digits only at word boundaries.

public class Regex_group_format {
    public static void main(String[] args) { 
        // Prepare the regular expression 
           String regex = "\\b(\\d{3})(\\d{3})(\\d{4})\\b"; 
    
           // Compile the regular expression 
           Pattern p = Pattern.compile(regex); 
    
           String source = "1234567890, 1234567, and 0987654321"; 
    
           // Get Matcher object 
           Matcher m = p.matcher(source); 
    
           // Start match and display formatted phone numbers 
           while (m.find()) { 
               System.out.printf("Phone: %s, Formatted Phone: (%s) %s-%s%n", 
                       m.group(), m.group(1), m.group(2), m.group(3)); 
           } /*  w w   w.  d  e   m o    2  s  .c   o   m*/
        } 
}
