package java_collections.string_builder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello ");

        //append
        StringBuilder sb2=sb.append("Java");//now original string is also changed  
        System.out.println(sb);//prints Hello Java  
        System.out.println(sb2);//prints Hello Java  


        //

        //charAt
        System.out.println(sb.charAt(1));//e

        //delete
        StringBuilder sb3 = sb.delete(1,3);  //including index 1 but excluding index 3 
        //also we have sb.delete(2) i.e. single index.
        System.out.println(sb);//Hlo Java  
        System.out.println(sb2);//Hlo Java , Since sb2 also pointing to same object
        System.out.println(sb3);//Hlo Java 

        sb=new StringBuilder("Hello ");

        //replace
        sb2=sb.replace(1,3,"Java");  //including index 1 but excluding index 3.
        System.out.println(sb);//prints HJavalo      
        System.out.println(sb2);//prints HJavalo     

        sb=new StringBuilder("Hello ");

        //insert
        sb2=sb.insert(1,"Java");//now original string is also changed  
        System.out.println(sb);//prints HJavaello 
        System.out.println(sb2);//prints HJavaello 

        sb=new StringBuilder("Hello ");

        //reverse
        sb2=sb.reverse();  
        System.out.println(sb);//prints " olleH" 
        System.out.println(sb2);//prints " olleH" 

        //length
        System.out.println(sb.length());

        // appendCodePoint
        StringBuilder m=new StringBuilder("Scaler");
        StringBuilder m2 = m.appendCodePoint(97); //Appending the character "a" (97) to the sequence.
        System.out.println(m);//Scalera
        System.out.println(m2);//Scalera

    }
}
