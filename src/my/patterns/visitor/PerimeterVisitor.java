package my.patterns.visitor;

public class PerimeterVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Circle perimeter: " + 2*Math.PI*circle.getRadius());
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Triangle perimeter: " + (triangle.getA()+ triangle.getB()+triangle.getC()));
    }

    @Override
    public void visit(Square square) {
        System.out.println("Square perimeter: " + square.getSide()*4);
    }
}
