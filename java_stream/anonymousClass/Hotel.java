package java_stream.anonymousClass;

public class Hotel {
    public int number;
    public int price;
    public int rating;

    public  Hotel(int number, int price, int rating) {
        this.number = number;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("(No:%d, Price:%d, Rating:%d)" , number, price, rating);
    }
}
