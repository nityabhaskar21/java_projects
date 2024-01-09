package multiThreading.executors;

public class Thread1 implements Runnable {
    int element;

    public Thread1(int element) {
        this.element = element;
    }
    
    @Override
    public void run() {
        System.out.println("Thread :"+Thread.currentThread().getName() + " prints: "+element) ;
    }
}
