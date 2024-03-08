package design_patterns.behavioural.strategy;

public interface PathCalculator {
    void calculatePath(String from , String to, TransportMode mode);
}
