package java_stream.consumer;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;

// In Java 8, Consumer is a functional interface; 
// it takes an argument and returns nothing.
public class ConsumerInterface1 {
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

       Consumer<String> print = x -> System.out.println(x);
       print.accept("java");
       
   }
}