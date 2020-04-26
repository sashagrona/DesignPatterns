package my.patterns;

import my.patterns.visitor.PerimeterVisitor;
import my.patterns.visitor.Shape;
import my.patterns.visitor.Triangle;
import my.patterns.visitor.Visitor;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle(3,4,5);
        Visitor visitor = new PerimeterVisitor();
        triangle.accept(visitor);
    }
}














