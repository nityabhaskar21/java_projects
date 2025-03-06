package ocajp8;
public class For1 {
    
    public static void main(String[] args) {
        for (int x=0; x<5; x++)
            x++;
        // System.out.println(x); 

        // for (;;); //valid

        for (int x=0; x<3; System.out.print(x)) { //valid
            x++;
        }

        int a[];


        // for (int x=0; x++;) {}  //invalid
    }
}
