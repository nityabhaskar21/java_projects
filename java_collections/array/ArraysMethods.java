package java_collections.array;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        // static <T> List<T> asList (T… a)
        //asList method is used to return the fixed-size list that mentioned Arrays back.
        // Fetching Array
        int Arr[] = { 10, 40, 35, 52, 75 };
        // Converting elements into list
        System.out.println("The Integer Array as a List = "+ Arrays.asList(Arr));   //[[I@36baf30c]


        // static int binarySearch(itemToSearch)
        //This method would search for a mentioned element in the array through the Binary Search algorithm.
        Arrays.sort(Arr);
        int ele = 35;
        System.out.println (ele + " is found at index = "+ Arrays.binarySearch(Arr, ele));


        // copyOf(original array, new length)
        //Copy method copies the mentioned array, truncates it, or pads it with a default value, 
        //but only if necessary so that copy has got the mentioned length.
        System.out.println("The Integer Array is: " + Arrays.toString(Arr));
        System.out.println("\nThe new Arrays fetched by copyOf is :"+ Arrays.toString(Arrays.copyOf(Arr, 10)));
    }
}
