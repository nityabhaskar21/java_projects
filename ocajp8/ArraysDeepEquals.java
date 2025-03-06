package ocajp8;

import java.util.Arrays;

public class ArraysDeepEquals {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int []arr2 = {1,2};
        // arr1[-1]=2; //ArrayIndexOutOfBoundsException

        // System.out.println(Arrays.deepEquals(arr1, arr2));
        int []arr3 = {2,4};

        Arrays.fill(arr3, 0, 1, 5);
        int [][][] arr4= new int[6][][];

        Object[] objArr= new String[2];
        // objArr[0]=new Object(); //ArrayStoreException
        // String[] strArr = objArr; //compile error
    }
}
