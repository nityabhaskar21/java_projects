package personal;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    static List<String> result = new ArrayList<>();
    // int count=
    public static void createDigit (int position, StringBuilder sb) {
    	if (position==5) {
    		result.add(sb.toString());
    		return;
    	}
    	if (position==0) {
    		for (int i=6; i<=9; i++) {
    			sb.append(i);
    			createDigit(position+1, sb);
    			sb.deleteCharAt(position);
    		}
    	} else {
    		for (int i=0; i<=9; i++) {
    			sb.append(i);
    			createDigit(position+1, sb);
    			sb.deleteCharAt(position);
    		}
    	}
    }
    
    

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        createDigit(0, sb);
        
        for (String num:result) {
            System.out.println(num);
        }
    }
}
