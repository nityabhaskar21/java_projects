package java_collections.array;

public class CharArray {
    public static void main(String[] args) {
        char []arr =  new char[10];
        //Default value of char data type in Java is '\u0000'
        // we can check arr[i]!=0 for empty values.

        arr[2]='b';

        for (int i = 0; i < 10; i++) {
            if (arr[i] != '\u0000') {
                System.out.println(arr[i]);
            }
        }
        //or
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
