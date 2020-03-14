package my.patterns.adapter;

public class Plane implements AirTransport {
    @Override
    public void fly() {
        System.out.println("I am Plane and I can move in the air");
    }
}
