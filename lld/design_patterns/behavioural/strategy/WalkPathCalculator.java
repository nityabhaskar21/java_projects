package lld.design_patterns.behavioural.strategy;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String from, String to, TransportMode mode) {
        System.out.println(String.format("From %s to %s using %s", from, to, mode));
    }
}
