package personal;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        String input = "This is a demo string";
        StringBuilder temp = new StringBuilder();

        String []inputArr = input.split(" ");

        List<String> output = new ArrayList<>();

        int maxLength = 0;
        for (String str:inputArr) {
            maxLength = Math.max(maxLength, str.length());
        }

        for (int i=0; i<maxLength; i++) {
            for (String str:inputArr) {
                if (str.length()>i) {
                    temp.append(str.charAt(i));
                }
            }
            output.add(temp.toString());
            temp = temp.delete(0, temp.length());
        }

        System.out.println(output);


    }
}
