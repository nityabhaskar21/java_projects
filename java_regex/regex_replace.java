package java_regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;


public class regex_replace {
    public static void main(String[] args) {
        String regex = "\\b(variable(.+)default=)(.+)}";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

       
        String input = "variable\"resources\"{type=list(string)default=#RESOURCE_ID}";
        
        Matcher m = p.matcher(input);
        
        while (m.find()) {
            System.out.println("m.group():"+ m.group());
            input = input.replaceAll(m.group(3), "hi");
        }
        
        System.out.println(input);
    
    }
    
}
