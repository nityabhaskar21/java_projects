package java_stream;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Stream1 {
   public static void main(String[] args) {
       try {
           System.setIn(new FileInputStream("E:\\java_projects\\input.txt"));
           System.setOut(new PrintStream(new FileOutputStream("E:\\java_projects\\output.txt")));
       } catch (Exception e) {
           System.out.println("Error!");
       }
       List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
       List<Integer> wordLengths = 
          words.stream()
               .map(String::length)
               .collect(Collectors.toList());

        System.out.println(wordLengths);
       
   }
}
