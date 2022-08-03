package java_regex;

import java.util.regex.Pattern; 
import java.util.regex.Matcher;

// We can get the matched text by using a group number in the regular expression.

// The group() method in the Matcher class is overloaded.

// One version of the group() method takes a group number as an argument and returns the matched text by that group.

// Example
// Suppose you have phone numbers embedded in the input text.

// All phone numbers are mixed with words and are ten digits long.

// The first three digits are the area code.

// The regular expression \b\d{10}\b will match all phone numbers in the input text.

// If we want to get the first three digits which is the area code, we can use the group to get the area code.

// In order to achieve this we have to code the regular expression using groups.

// The regular expression placing the first three digits of a phone number in a group would be \b(\d{3})\d{7}\b.

// If m is the reference to a Matcher object associated with this pattern, 
// m.group(1) will return the first three digits of the phone number after a successful match.

// We can also use m.group(0) to get the entire matched text.

public class Regex_group_match {
    public static void main(String[] args) { 
        // Prepare a regular expression: 
        // A group of 3 digits followed by 7 digits. 
        String regex = "\\b(\\d{3})\\d{7}\\b"; 

        // Compile the regular expression 
        Pattern p = Pattern.compile(regex); 

        String source = "1234567890, 1234567, and 0987654321"; 

        // Get the Matcher object 
        Matcher m = p.matcher(source); 

        // Start matching and display the found area codes 
        while (m.find()) { 
            String phone = m.group(); 
            String areaCode = m.group(1); 
            System.out.printf("Phone: %s, Area Code: %s%n", phone, areaCode); 
        } /*w    w  w.  d    em    o  2 s .  c   o  m */
    }
}
