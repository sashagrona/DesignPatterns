package my.patterns;

import my.patterns.mediator.Consumer;
import my.patterns.mediator.Mediator;
import my.patterns.mediator.MediatorImpl;
import my.patterns.mediator.Producer;
import my.patterns.strategy.InsertionSortStrategy;
import my.patterns.strategy.SortStrategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Thread prod = new Thread(new Producer(mediator, 5));
        Thread cons = new Thread(new Consumer(mediator));
        prod.start();
        cons.start();
    }
}














