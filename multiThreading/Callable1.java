package multiThreading;

import java.util.concurrent.Callable;

public class Callable1 implements Callable<String>{
    
    @Override
    public String call() {
        System.out.println("Inside callable");
        return "returnCallable";
    }
}
