package multiThreading.producerConsumer;

import java.util.Queue;

public class Producer implements Runnable{
    Queue<Object> store;
    int maxSize;
    String name;

    Producer(Queue<Object> store, int maxSize, String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
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
