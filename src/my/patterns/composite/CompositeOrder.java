package my.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeOrder extends Order {
    private List<Order> orders = new ArrayList<>();
    private String kitName;

    public CompositeOrder(String kitName) {
        this.kitName = kitName;
    }

    public void add(Order order){
        orders.add(order);
    }
    public void remove(Order order){
        orders.remove(order);
    }
    public List<Order> getOrders(){
        return orders;
    }

    @Override
    public double getPrice() {
        return orders.stream().mapToDouble(x -> x.getPrice()).sum();
    }

    @Override
    public void printOrderName() {
        System.out.println("Order kit for " + kitName + ":" );
        for (Order order:orders) {
            order.printOrderName();
        }
    }
}
