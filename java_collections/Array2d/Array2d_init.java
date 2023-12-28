package java_collections.Array2d;

import java.util.Arrays;

public class Array2d_init {
    public static void main(String[] args) 
    { 
        int rows = 80, columns = 5; 
        int[][] marks = new int[rows][columns]; 
  
        // initializing the array elements using for loop 
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < columns; j++) { 
                marks[i][j] = i + j; 
            } 
        } 
  
        // printing the first three rows of marks array 
        System.out.println("First three rows are: "); 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < columns; j++) { 
                System.out.printf(marks[i][j] + " "); 
            } 
            System.out.println(); 
        } 

        //Using Arrays fill
        for (int[] row : marks) {
            Arrays.fill(row, -1);
        }
        System.out.println("Using Arrays fill: "); 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < columns; j++) { 
                System.out.printf(marks[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
}
