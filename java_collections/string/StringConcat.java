package java_collections.string;

public class StringConcat {
    public static void main(String[] args) {
        // there are two convenient and best ways to concatenate strings in Java. They are as follows:
        // By concat() method.
        // By + (String concatenation) operator

        String s1 = "Hello";
        s1.concat("Java"); 
        System.out.println(s1); // Hello 

        String s2 = new String("Java");
        s2.concat(" Core"); 
        s2 = s1.concat(" Programming"); 
        System.out.println(s2); //Java Programming
            
        String s3 = "Shubh" + " Deep"; 
        System.out.println(s3); //Shubh Deep

        int age = 16;
        String s = "She is " + age + " years old.";
        System.out.println(s); // Output: She is 16 years old.

        // String s4=1+(String)2;
        //Error Because String and Integer are not in the same Object hierarchy.

        // Instead Use :-
        // String.valueOf(integer), or Integer.toString(integer) for primitive,
        // or
        // Integer.toString() for the object.

        int myInteger = 1;
        String myString = Integer.toString(myInteger);

        Integer myIntegerObject = new Integer(1);
        String myString2 = myIntegerObject.toString();

    }
}
