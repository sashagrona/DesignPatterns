package my.patterns.visitor;

public interface Visitor {
    void visit(Circle circle);
    void visit(Triangle triangle);
    void visit(Square square);
}
