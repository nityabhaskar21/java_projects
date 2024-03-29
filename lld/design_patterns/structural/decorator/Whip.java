package lld.design_patterns.structural.decorator;

public class Whip implements Addon {
    Beverage b;
    Whip(Beverage b) {
        this.b = b;
    }

    @Override
    public int getCost() {
        return 7 + b.getCost();
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Whip addon");
    }
}
