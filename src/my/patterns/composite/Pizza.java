package my.patterns.composite;

public class Pizza extends Food {

    public Pizza(double price) {
        super(price);
    }

    @Override
    public void printOrderName() {
        System.out.println("That's FOOD, Pizza");
    }
}
