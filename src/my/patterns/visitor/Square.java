package my.patterns.visitor;

public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
