package lld.design_patterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        //only one object created.
        var obj1 = Singleton.getInstance();
        var obj2 = Singleton.getInstance();
        var obj3 = Singleton.getInstance();
        var obj4 = Singleton.getInstance();
    }
}
