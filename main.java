
import java.util.regex.Pattern; 
import java.util.regex.Matcher; 
class Test {
    public static void main(String[] args) { 
        // Prepare the regular expression 
           String regex = "(.+)(?=(?:(?:path)|(?:object)|(?:errors?))).+(?<=(?:\\/)|(?:value ))(\\S+)(?<!\\])\\]?(.*+)"; 
    
           // Compile the regular expression 
           Pattern p = Pattern.compile(regex); 
    
           String source = "The object path=[/infra/domains/default/groups/MirunalitEst_0014] cannot be deleted as either it has children or it is being referenced by other objects internalRuleCreationTest_0001"; 
    
           // Get Matcher object 
           Matcher m = p.matcher(source); 
    
           // Start match and display formatted phone numbers 
        //    while (m.find()) { 
        //        System.out.printf("Group1: %s, Group2: %s, Group3: %s", 
        //                 m.group(1), m.group(2), m.group(3)); 
        //    } /*  w w   w.  d  e   m o    2  s  .c   o   m*/


        StringBuilder extractedMsg = new StringBuilder();
		while (m.find()) {
			for (int i = 1; i <= m.groupCount(); i++) {
				if (m.group(i).length() > 0) 
					extractedMsg.append(m.group(i));
			}
		}
        System.out.println(extractedMsg.toString());
    } 
}
