package multiThreading.synxronizationProblem;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor suntractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(suntractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
