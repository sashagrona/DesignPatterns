package my.patterns;

import my.patterns.bridge.*;

public class Main {

    public static void main(String[] args) {
        Color red = new RedColor();
        Color green = new GreenColor();
        Shape triangle = new Triangle(red);
        Shape circle = new Circle(green);
        triangle.getColor();
        circle.getColor();
    }
}
