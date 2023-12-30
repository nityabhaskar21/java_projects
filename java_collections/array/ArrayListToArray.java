package java_collections.array;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<>();

        // Add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);

        // Create a new array of String type
        // size of array is same as the ArrayList
        String[] arr = new String[languages.size()];

        // Convert ArrayList into an array
        languages.toArray(arr);

        // print all elements of the array
        System.out.print("Array: ");
        for(String item:arr) {
            System.out.print(item+", ");
        }
        System.out.println("");

        
        // Convert ArrayList into an array without parameter
        // the method has no parameter
        Object[] obj = languages.toArray();

        // print all elements of the array
        System.out.print("Array: ");
        for(Object item : obj) {
            System.out.print(item+", ");
        }
    }
}
