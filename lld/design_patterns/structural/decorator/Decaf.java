package lld.design_patterns.structural.decorator;

public class Decaf implements Beverage {
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public void getDesc() {
        System.out.println("Decaf");
    }
}
