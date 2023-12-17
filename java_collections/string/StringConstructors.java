package java_collections.string;

public class StringConstructors {
    public static void main(String[] args) {
        
        // 1. String(): To create an empty String, we will call the default constructor. 
        // The general syntax to create an empty string in java program is as follows:
        String s1 = new String();


        // 2. String(String str): It will create a string object in the heap area and stores the given value in it. 
        // The general syntax to construct a string object with specified string str is as follows:
        String s2 = new String("Hello Java");


        // 3. String(char chars[ ]): This constructor creates a string object and stores the array of characters in it. 
        // The general syntax to create a string object with a specified array of characters is as follows:
        char chars[] = { 'a', 'b', 'c', 'd' };
        String s3 = new String(chars);


        // 4. String(char chars[ ], int startIndex, int count): This constructor creates 
        // and initializes a string object with a subrange of a character array.
        char chars1[] = { 'w', 'i', 'n', 'd', 'o', 'w', 's'  };
        String s4 = new String(chars1, 2, 3);


        // 5. String(byte byteArr[ ]): This constructor constructs a new string object b
        // y decoding the given array of bytes (i.e., by decoding ASCII values into the characters) 
        // according to the system’s default character set.
        byte b[] = { 97, 98, 99, 100 }; // Range of bytes: -128 to 127. These byte values will be converted into corresponding characters. 
        String s = new String(b); 
        System.out.println(s);  //abcd

    }
}
