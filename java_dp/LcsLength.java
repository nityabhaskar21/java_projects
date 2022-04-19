package java_dp;

import java.io.*;
import java.util.*;
public class LcsLength {

   private static int lcsLength(String a, String b) {
       int lcsLength = 0;
        if (a.isEmpty() || b.isEmpty()) {
            return 0;
        }

       return lcsLength;
   }

   public static void main(String[] args) {
       try {
           System.setIn(new FileInputStream("E:\\ava_projects\\input.txt"));
           System.setOut(new PrintStream(new FileOutputStream("E:\\java_projects\\output.txt")));
       } catch (Exception e) {
           System.out.println("Error!");
       }
       //Scanner sc = new Scanner(System.in);
       //int n = sc.nextInt();
       //System.out.println(n);
       //sc.close();
       //Your Code here

       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String b = sc.next();
       int lcsLength = lcsLength(a, b);
       System.out.println("Length of LCS: "+ lcsLength);
       sc.close();
   }
}
