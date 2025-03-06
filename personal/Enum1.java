package personal;

enum Speed {
    Fast, Faster, Slow;
    // int speed;
    // public Speed() { //Only private or defaulr permitted

    // }
}

public class Enum1 {
    public static void main(String[] args) {
        System.out.println(Speed.Fast==Speed.Faster); //false
        System.out.println(Speed.Fast==Speed.Fast); //true

    }
}
