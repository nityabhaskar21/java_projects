package java_collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(7);
        q.offer(3);
        q.offer(9);

        System.out.println(q);  //[7, 3, 9]

        System.out.println(q.peek()); //7

        q.poll();

        System.out.println(q.peek()); //3
    }
}
