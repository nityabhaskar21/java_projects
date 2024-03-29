package lld.design_patterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        b=new Milk(b);
        b=new Whip(b);
        b=new Milk(b);

        b.getDesc();
        System.out.println(b.getCost());
    }
}
