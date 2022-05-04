package java_stream;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Outer {
    public int i;
    public Outer(int input) {
        i = input;
    }
    public void printTestInstance() {
        System.out.println("Testing the instance method" + i);
    }

    public static void printTestStatic() {
        System.out.println("Testing the static method");
    }
}


public class MethodReference {
   public static void main(String[] args) {
       try {
           System.setIn(new FileInputStream("E:\\java_projects\\input.txt"));
           System.setOut(new PrintStream(new FileOutputStream("E:\\java_projects\\output.txt")));
       } catch (Exception e) {
           System.out.println("Error!");
       }

       List<Outer> foos = new ArrayList<>();
       IntStream
        .range(1, 4)
        .forEach(i -> foos.add(new Outer(i)));

        foos.stream()
            .peek(f -> f.printTestInstance())
            .collect(Collectors.toList());

       
   }
}

