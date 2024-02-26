package java_collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMax {
    //1
    PriorityQueue<Integer> maxPQ1 = new PriorityQueue<>(Collections.reverseOrder()); 

    //2
    PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a,b) -> b - a); 

    //3
    PriorityQueue<Integer> maxPQ3 = new PriorityQueue<>((a,b) -> b.compareTo(a)); 

}
