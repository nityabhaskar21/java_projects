package java_regex;

public class Regex_group_replace {
    public static void main(String[] args) { 
        // Prepare the regular expression 
           String regex = "\\b(\\d{3})(\\d{3})(\\d{4})\\b"; 
           String replacementText = "($1) $2-$3"; 
           String source = "1234567890, 1234567, and 0987654321"; 
    
           // Use replaceAll() method of the String class 
           String formattedSource = source.replaceAll(regex, replacementText) ;
           System.out.println(formattedSource);
        } 
}
