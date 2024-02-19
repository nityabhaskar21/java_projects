package multiThreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            Runnable task = new Thread1(i);
            executor.execute(task);
        }
        //Stops the thread even tasks not completed yet
        // executor.shutdownNow();

        executor.shutdown();
    }
}
