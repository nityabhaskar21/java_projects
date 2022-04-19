package java_new_features;
import java.io.*;
import java.util.*;
public class TestSnippet {
   public static void main(String[] args) {
       try {
           System.setIn(new FileInputStream("E:\\java_projects\\input.txt"));
           System.setOut(new PrintStream(new FileOutputStream("E:\\java_projects\\output.txt")));
       } catch (Exception e) {
           System.out.println("Error!");
       }
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String s = sc.next();
       System.out.println(n + s);
       sc.close();
       //Your Code here
       
   }
}
