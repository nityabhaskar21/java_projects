package ocajp8;

public class IntegerArray {
    // int a[] = new int[4];
    public static void main(String[] args) {
        Integer[] a = new Integer[2];
        a[1]=10;
        for (Integer I:a) System.out.println(I);

        Number[] f = new Float[2];
        f[1]=10;
        for (Number I:f) System.out.println(I);

        int arr[] = {1};
        double arr1[] = arr;
    }
}
