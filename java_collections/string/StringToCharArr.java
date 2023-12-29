package java_collections.string;

public class StringToCharArr {
    public static void main(String[] args) {
        String str = "Java Programming";

        // creating a char array
        char[] result;

        result = str.toCharArray();
        for (char c : result) {
            System.out.print(c+",");    //J,a,v,a, ,P,r,o,g,r,a,m,m,i,n,g,
        }
    }
}
