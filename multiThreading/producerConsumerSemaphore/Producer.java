package multiThreading.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Object> store;
    int maxSize;
    String name;
    Semaphore semaphore;

    Producer(Queue<Object> store, int maxSize, String name, Semaphore semaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() < maxSize) {
                    System.out.println(name + " is adding the object. size =" + store.size());
                    store.add(new Object());
                }
            }
        }
        
    }
}
