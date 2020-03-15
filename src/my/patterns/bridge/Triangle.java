package my.patterns.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public Color getColor() {
        System.out.println("This Triangle is " + color.getColor());
        return color;
    }
}
