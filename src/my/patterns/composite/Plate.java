package my.patterns.composite;

public class Plate extends Dishes {
    public Plate(double price) {
        super(price);
    }

    @Override
    public void printOrderName() {
        System.out.println("That's dishes, Plate");
    }
}
