package my.patterns.adapter;

public class Superman implements SelfTransport {
    @Override
    public void move() {
        System.out.println("I am the Superman and I can move in the air as well");
    }
}
