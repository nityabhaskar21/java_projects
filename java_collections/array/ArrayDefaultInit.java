package java_collections.array;

import java.util.Arrays;

public class ArrayDefaultInit {
    public static void main(String[] args) {
        int[] array = new int[5];
        Arrays.fill(array, -1);
        
        for (int x: array) {
            System.out.print(x);
        }
    }
}
