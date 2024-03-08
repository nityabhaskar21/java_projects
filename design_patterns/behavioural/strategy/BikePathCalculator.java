package design_patterns.behavioural.strategy;

public class BikePathCalculator implements PathCalculator{

    @Override
    public void calculatePath(String from, String to, TransportMode mode) {
        System.out.println(String.format("From %s to %s using %s", from, to, mode));
    }
    
}
