package my.patterns.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public Color getColor() {
        System.out.println("This Circle is " + color.getColor());
        return color;
    }
}
