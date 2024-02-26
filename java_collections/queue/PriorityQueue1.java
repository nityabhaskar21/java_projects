package java_collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
         // Creating a priority queue
        Queue<Integer> numbers = new PriorityQueue<>();

        // Using the offer() method
        numbers.offer(1);
        numbers.add(4);
        numbers.add(2);
        
        //By default min heap
        while(!numbers.isEmpty()){
            int e = numbers.poll();
            System.out.println(e);
        }
    }
}
