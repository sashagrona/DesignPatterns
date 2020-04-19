package my.patterns.iterator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class DepthFirstSearchIterator<T> implements GraphIterator<T> {
    private Set<T> visited = new HashSet<T>();
    private Stack<T> stack = new Stack<>();
    private T start;
    private Graph<T> graph;
    private boolean firstEl = true;

    public DepthFirstSearchIterator(T currentNode, Graph<T> graph) {
        this.graph = graph;
        this.start = currentNode;
        visited.add(currentNode);
        stack.add(currentNode);
    }

    @Override
    public boolean hasNext() {
        if (!stack.isEmpty()) {
            List<T> neighbours = graph.getNeighbours(stack.peek());
            if (neighbours != null && !visited.containsAll(neighbours)) {
                for (T t : neighbours) {
                    if (!visited.contains(t)) {
                        return true;
                    }
                }
            } else {
                stack.pop();
                return hasNext();
            }

        }
        return false;
    }

    @Override
    public T next() {
        if (firstEl){
            firstEl = false;
            return start;
        }
        List<T> neighbours = graph.getNeighbours(stack.peek());
        for (T t : neighbours) {
            if (!visited.contains(t)) {
                visited.add(t);
                stack.add(t);
                return t;
            }
        }
        return null;
    }

    @Override
    public void remove() {

    }
}
