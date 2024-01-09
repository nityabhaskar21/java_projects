package multiThreading.print1to100;

public class Client {
    public static void main(String[] args) {
        System.out.println("Starting");
        //Print 1-100 all in different threads

        for (int i = 0; i < 100; i++) {
            Thread1 t1 = new Thread1(i);
            Thread thread = new Thread(t1);
            thread.start();
        }
    }
}
