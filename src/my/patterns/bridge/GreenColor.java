package my.patterns.bridge;

public class GreenColor implements Color {

    @Override
    public Color get() {
        return this;
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
