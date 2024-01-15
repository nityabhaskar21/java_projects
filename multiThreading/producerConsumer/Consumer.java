package multiThreading.producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{
    Queue<Object> store;
    int maxSize;
    String name;

    Consumer(Queue<Object> store, int maxSize, String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
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
