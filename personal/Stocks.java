package personal;

public class Stocks {
    public static void main(String[] args) {
        //[8,3,9,1,5,10]
        //Result 10-1=9

        int [] input = new int[] {18,4,19,31,15,36, 2, 20};
        int result=Integer.MIN_VALUE;
        int currMin = input[0];

        int n=input.length;

        for (int i=1; i<n; i++) {
            int currPrice = input[i];
            if (currPrice>currMin) {
                result=Integer.max(result, currPrice-currMin);
            } else {
                currMin = currPrice;
            }
              
        }
        System.out.println(result);
    }
}
