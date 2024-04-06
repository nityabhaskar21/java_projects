package java_collections.string_builder;

public class StringBuilderConstructors {
    public static void main(String[] args) {
        
        StringBuilder ob1 = new StringBuilder();
        //This constructor is used for creating a StringBuilder object with no characters in it 
        //and initial capacity of 16 characters.

        StringBuilder ob2 = new StringBuilder(10);
        //This constructor is used for creating a StringBuilder object with no characters in it 
        //and an initial capacity specified by the capacity argument.
        System.out.println(ob2.toString());

        CharSequence seq = "Scaler";
        StringBuilder sb3 = new StringBuilder(seq);
        //This constructor is used for creating a StringBuilder object with initial characters 
        //specified by the CharSequence argument seq.


        StringBuilder sb4 = new StringBuilder("Scaler");
        //This constructor is used for creating a StringBuilder object with 
        //initial String content the same as str characters
    }
}
