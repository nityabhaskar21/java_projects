package multiThreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("hi from main thread 1st");
        Thread1 thread1 = new Thread1("thread1");

        // daemon thread can be dead if user threads are dead even if execution not complete.
        // thread1.setDaemon(true); 

        // thread1.start();
        // System.out.println("hi from main thread 2nd");


        Thread thread2 = new Thread(new Thread2(), "thread2");
        // thread2.start();

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread()+", "+i);
            }
        }, "thread3");
        thread3.start();

    }
}
