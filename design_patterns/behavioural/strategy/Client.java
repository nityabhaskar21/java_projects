package design_patterns.behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        PathCalculator path = new BikePathCalculator();
        path.calculatePath("Delhi", "Pune", TransportMode.CAR);
    }
    
}
