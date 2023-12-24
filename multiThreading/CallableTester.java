package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTester {

    // Callable interface in Java is used to make a class instance run as a thread by implementing it. 
    // The Callable interface is provided by the java.util.concurrent package. 
    // The Callable interface can return any object as a result and can throw an exception.
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> callable = new Callable1();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<String> future =executor.submit(callable);
        Thread.sleep(2000);
        System.out.println(future.get());
        System.out.println(future.get());
        executor.shutdown();
    }
}
