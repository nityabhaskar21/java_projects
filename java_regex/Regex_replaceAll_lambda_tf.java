package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_replaceAll_lambda_tf {
        public static void main(String[] args) {
        final String regex = "(\\=\\s+)(?=[\\{\\[]\\s)";
        final String string = "{\n"
	 + "	provider = {\n"
	 + "		aws = {\n"
	 + "			region = ap - south - 1,\n"
	 + "			version = 4.55 .0\n"
	 + "		}\n"
	 + "	}, resource = {\n"
	 + "		aws_instance = {\n"
	 + "			instance-24 = {\n"
	 + "				key_name = testt - keyy - pairr,\n"
	 + "				vpc_security_group_ids = [sg - 089 bf2068d8abfcb1],\n"
	 + "				subnet_id = subnet - 0b 41955 c9e81d2f3c,\n"
	 + "				ami = ami - 0 fb2e2f28063769a0,\n"
	 + "				instance_type = t2.micro,\n"
	 + "				root_block_device = {\n"
	 + "					volume_size = 35,\n"
	 + "					delete_on_termination = true\n"
	 + "				},\n"
	 + "				tags = {\n"
	 + "					managed - by = sify - cmp,\n"
	 + "					managedBy = CMP,\n"
	 + "					Name = instance - 25\n"
	 + "				}\n"
	 + "			}\n"
	 + "		}\n"
	 + "	}\n"
	 + "}";
        final String subst = " ";
        
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        
        // The substituted value will be contained in the result variable
        final String result = matcher.replaceAll(subst);
        
        System.out.println("Substitution result: " + result);
        
    }
}
