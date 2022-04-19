package java_stream;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Partition {
   public static void main(String[] args) {
       try {
           System.setIn(new FileInputStream("E:\\java_projects\\input.txt"));
           System.setOut(new PrintStream(new FileOutputStream("E:\\java_projects\\output.txt")));
       } catch (Exception e) {
           System.out.println("Error!");
       }
       
       List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
       Map<Boolean, List<Integer>> isEven = intList.stream().collect(
         Collectors.partitioningBy(i -> i % 2 == 0));

       System.out.println(isEven);
       
   }
}
