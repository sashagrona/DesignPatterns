package my.patterns.bridge;

public class RedColor implements Color {

    @Override
    public Color get() {
        return this;
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
