package my.patterns.adapter;

public class SupermanAdapter implements AirTransport{
    private SelfTransport selfTransport;

    public SupermanAdapter(SelfTransport selfTransport) {
        this.selfTransport=selfTransport;
    }

    @Override
    public void fly() {
        selfTransport.move();
    }
}
