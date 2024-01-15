package multiThreading.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Queue<Object> store;
    int maxSize;
    String name;
    Semaphore semaphore;

    Consumer(Queue<Object> store, int maxSize, String name, Semaphore semaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() > 0) {
                    System.out.println(name + " is removing the object. size =" + store.size());
                    store.remove();
                }
            }   
        }
        
    }
}
