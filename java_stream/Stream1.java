package java_stream;

import java.io.*;
import java.util.*;
public class Stream1 {
   public static void main(String[] args) {
       try {
           System.setIn(new FileInputStream("E:\\java_projects\\input.txt"));
           System.setOut(new PrintStream(new FileOutputStream("E:\\java_projects\\output.txt")));
       } catch (Exception e) {
           System.out.println("Error!");
       }
       //Scanner sc = new Scanner(System.in);
       //int n = sc.nextInt();
       //System.out.println(n);
       //sc.close();
       //Your Code here
       
   }
}
