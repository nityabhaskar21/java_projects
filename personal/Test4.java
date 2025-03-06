package personal;

public class Test4 {
    String s = new String();
    public static void main(String[] args) {
        String input = "this is new string";
        // StringBuilder sb = new StringBuilder(input);

        //
        StringBuilder output = new StringBuilder();
        int i=0;
        StringBuilder temp = new StringBuilder();
        while (i<input.length()) {
            
            if (input.charAt(i)==' ' || i==input.length()-1) {
                temp.reverse();
                temp.append(' ');
                output.append(temp);
                temp=new StringBuilder();
            } else {
                temp.append(input.charAt(i));
            }
            i++;
        }

        System.out.println(output);

    }
}
