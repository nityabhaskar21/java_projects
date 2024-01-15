package multiThreading.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        Semaphore producerSemaphore = new Semaphore(6);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer p1 = new Producer(store, maxSize, "p1", producerSemaphore);
        Producer p2 = new Producer(store, maxSize, "p2", producerSemaphore);
        Producer p3 = new Producer(store, maxSize, "p3", producerSemaphore);

        Consumer c1 = new Consumer(store, maxSize, "c1", consumerSemaphore);
        Consumer c2 = new Consumer(store, maxSize, "c2", consumerSemaphore);
        Consumer c3 = new Consumer(store, maxSize, "c3", consumerSemaphore);
        Consumer c4 = new Consumer(store, maxSize, "c4", consumerSemaphore);
        Consumer c5 = new Consumer(store, maxSize, "c5", consumerSemaphore);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
        Thread t7 = new Thread(c4);
        t7.start();
        Thread t8 = new Thread(c5);
        t8.start();

    }
}
