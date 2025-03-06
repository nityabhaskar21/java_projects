package ocajp8;

import java.io.IOException;
import java.util.Arrays;

public class Array2d {
    final static int i; //compilation fail

    public static void main(String[] args){
        final int j;
        j=2;
        int [][] ints = new int[2][];
        ints[1]=new int[]{3,4};
        ints[1]=new int[]{1,2};

        System.out.println(ints);

        // Arrays.sort(ints[1]);

        System.out.println(Arrays.toString(ints[1]));

        // Arrays.sort(ints); //exception
        // Arrays.sort(null); //exception

        System.out.println(Arrays.toString(ints[0]));
    }
}
