package my.patterns.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> stack = new Stack<>();

    public Memento getMemento() {
        return stack.pop();
    }

    public void addMemento(Memento memento) {
        stack.add(memento);
    }
}
