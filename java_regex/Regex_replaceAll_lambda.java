package java_regex;

import java.util.regex.Pattern;

public class Regex_replaceAll_lambda {
    public static void main(String[] args) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);

        String str = "ab3de67";

        String replacedStr = pattern.matcher(str).replaceAll(match -> ":"+(match.group(0)+":"));

        System.out.println(replacedStr);
        
    }
}
