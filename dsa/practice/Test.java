package dsa.practice;

public class Test {

    public static void main(String[] args) {
        Runnable test ;
        Thread t = new Thread(test);
        t.start();
    }
}
