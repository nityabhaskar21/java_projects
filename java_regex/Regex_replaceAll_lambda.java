package java_regex;

import java.util.regex.Pattern;

public class Regex_replaceAll_lambda {
    public static void main(String[] args) {
        String regex = "\\\"(\\w+)\\\"(?=\\ *\\:)";
        Pattern pattern = Pattern.compile(regex);
        String str = "\"instance_type\" : \"t2.micro\", \n"
        + "\"ami\" : \"ami-12345678\",\n"
        + " \"subnet_id\" : \"subnet-12345678\",\n"
        + " \"security_groups\" : [ \"sg-12345678\" ],\n"
        + " \"tags\" : { \n"
        + "     \"Name\" : \"MyEC2Instance\", \n"
        + "     \"Environment\" : \"Production\"\n"
        + "\n"
        + " }";


        String replacedStr = pattern.matcher(str).replaceAll(match -> (match.group(1)));
        System.out.println(replacedStr);


        // //Alternate way to replace
        // String replacementText = ":$0:";    //$0 represents group 0
        // String replacedStr1 = str.replaceAll(regex, replacementText);
        // System.out.println(replacedStr1);
        
    }
}
