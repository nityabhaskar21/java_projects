package design_patterns.creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static Singleton instance=null;
    private static ReentrantLock lock = new ReentrantLock();

    private Singleton() {
        System.out.println("Object Created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance= new Singleton();
            }
            lock.unlock();
        }
        return instance;
    }
}
