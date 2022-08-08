package java_regex;

import java.util.regex.Pattern;

public class Regex_replaceAll_lambda {
    public static void main(String[] args) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        String str = "ab3de67fgh";


        String replacedStr = pattern.matcher(str).replaceAll(match -> ":"+(match.group(0)+":"));
        System.out.println(replacedStr);


        //Alternate way to replace
        String replacementText = ":$0:";    //$0 represents group 0
        String replacedStr1 = str.replaceAll(regex, replacementText);
        System.out.println(replacedStr1);
        
    }
}
