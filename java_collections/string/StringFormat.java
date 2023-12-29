package java_collections.string;

public class StringFormat {
    public static void main(String[] args) {
        String language = "Java";
        int number = 30;
        String result;

        // format object as a string
        result = String.format("Language: %s", language);

        System.out.println(result);  // Language: Java

        // format number as a hexadecimal number
        result = String.format("Hexadecimal Number: %x", number);  // 1e

        System.out.println(result); // Hexadecimal Number: 1e


        //  Specifier	Description
        //     %b, %B	"true" or "false" based on the argument
        //     %s, %S	a string
        //     %c, %C	a Unicode character
        //     %d	    a decimal integer (used for integers only)
        //     %o	    an octal integer (used for integers only)
        //     %x, %X	a hexadecimal integer (used for integers only)
        //     %e, %E	for scientific notation (used for floating-point numbers)
        //     %f	    for decimal numbers (used for floating-point numbers)
    }
}
