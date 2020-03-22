package my.patterns;

import my.patterns.composite.*;

public class Main {

    public static void main(String[] args) {
        Order pepsi = new Pepsi(20d);
        Order pizza = new Pizza(65d);
        Order plate = new Plate(10d);
        CompositeOrder compositeMain = new CompositeOrder("Main");
        CompositeOrder compositeChild = new CompositeOrder("Child");
        compositeMain.add(pepsi);
        compositeMain.add(pizza);
        compositeMain.add(compositeChild);
        compositeChild.add(pizza);
        compositeChild.add(plate);
        compositeChild.remove(pizza);
        System.out.println(compositeChild.getPrice());
        compositeMain.printOrderName();
    }
}
