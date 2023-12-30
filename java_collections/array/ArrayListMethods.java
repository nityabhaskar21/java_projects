package java_collections.array;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListMethods {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add() method without the index parameter
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);

        // get the element from the arraylist
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);

        // remove element from index 2
        String str2 = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + str2);

        // sort the ArrayList in ascending order
        languages.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + languages);

        // sort the ArrayList in descending order
        languages.sort(Comparator.reverseOrder());
        System.out.println("Sorted ArrayList: " + languages);

        // size()	Returns the length of the arraylist.
        // sort()	Sort the arraylist elements.
        // clone()	Creates a new arraylist with the same element, size, and capacity.
        // contains()	Searches the arraylist for the specified element and returns a boolean result.
        // ensureCapacity()	Specifies the total element the arraylist can contain.
        // isEmpty()	Checks if the arraylist is empty.
        // indexOf()	Searches a specified element in an arraylist and returns the index of the element.
        // clear() method to remove all the elements of languages
    }
}
