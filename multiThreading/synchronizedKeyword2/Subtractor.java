package multiThreading.synchronizedKeyword2;

public class Subtractor implements Runnable{
    private Count count;
    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=1; i<=10000; i++) {
            synchronized (count) {
            count.decrementValue(i);
            }
        }
        System.out.println("After subtractor: " + count.getValue());
    }
}
