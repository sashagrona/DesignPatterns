package my.patterns;

import my.patterns.mediator.Consumer;
import my.patterns.mediator.Mediator;
import my.patterns.mediator.MediatorImpl;
import my.patterns.mediator.Producer;
import my.patterns.memento.Caretaker;
import my.patterns.memento.Originator;
import my.patterns.strategy.InsertionSortStrategy;
import my.patterns.strategy.SortStrategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator("name", 5, "title");
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.saveToMemento());
        originator.setLevel(10);
        caretaker.addMemento(originator.saveToMemento());
        System.out.println(caretaker.getMemento());
        System.out.println(caretaker.getMemento());
    }
}














