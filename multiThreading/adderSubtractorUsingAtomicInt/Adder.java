package multiThreading.adderSubtractorUsingAtomicInt;

public class Adder implements Runnable {
    private Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=1; i<=10000; i++) {
            count.value.addAndGet(i);
        }
        System.out.println("After adder: " + count.value);
    }
}
