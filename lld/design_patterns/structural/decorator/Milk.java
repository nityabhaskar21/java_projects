package lld.design_patterns.structural.decorator;

public class Milk implements Addon {
    Beverage b;
    Milk(Beverage b) {
        this.b = b;
    }

    @Override
    public int getCost() {
        return 5+b.getCost();
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Milk addon");
    }
    
}
