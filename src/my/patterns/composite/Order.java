package my.patterns.composite;

public abstract class Order {
    private double price;

    public Order() {
    }

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void printOrderName();
}
