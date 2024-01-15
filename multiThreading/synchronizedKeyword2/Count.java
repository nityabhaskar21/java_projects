package multiThreading.synchronizedKeyword2;

public class Count {
    private int value=0;
    public synchronized void incrementValue(int inc) {
        this.value+=inc;
    }
    public synchronized void decrementValue(int inc) {
        this.value-=inc;
    }
    public int getValue() {
        return value;
    }
}
