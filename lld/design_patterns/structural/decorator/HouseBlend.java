package lld.design_patterns.structural.decorator;

public class HouseBlend implements Beverage {

    @Override
    public int getCost() {
        return 25;
    }

    @Override
    public void getDesc() {
        System.out.println("Houseblend");
    }
    
}
