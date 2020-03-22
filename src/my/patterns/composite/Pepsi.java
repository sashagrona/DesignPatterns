package my.patterns.composite;

public class Pepsi extends Beverage {
    public Pepsi(double price) {
        super(price);
    }

    @Override
    public void printOrderName() {
        System.out.println("That's Beverage, Pepsi");
    }
}
