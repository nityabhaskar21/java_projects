package java_collections.string;

public class StringSplit {
    public static void main(String[] args) {
        String text = "Java is a fun programming language";

        // split string from space
        String[] result = text.split(" ");

        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }

        String text2="abc";
        String[] result2 = text2.split("");
        for (String str : result2) {
            System.out.print(str + ", ");   //a, b, c,
        }
    }
}
