package ocajp8;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        // arr.add(2, 5); //exception

        System.out.println(arr);

        // Integer i = new Integer(2.2); //compilatioon etrrror

        // int i2 = 2.2; //compilation


        Integer i3=3;
        int c=5;
        System.out.println(i3+3.3);

        float f = 5.5f;
        int c2=(int)f;
        System.out.println(c2);
    }
}
