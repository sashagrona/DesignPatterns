package my.patterns.iterator;

import java.util.*;

public class BreadthFirstSearchIterator<T> implements GraphIterator<T> {
    private Graph<T> graph;
    private Queue<T> queue = new ArrayDeque<>();
    private Set<T> visited = new HashSet<>();

    public BreadthFirstSearchIterator(T currentNode, Graph<T> graph) {
        this.graph = graph;
        queue.add(currentNode);
        visited.add(currentNode);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public T next() {
        T next = queue.poll();
        List<T> neighbours = graph.getNeighbours(next);
        if (neighbours!=null) {
            for (T t: neighbours){
                if (!visited.contains(t)){
                    queue.add(t);
                    visited.add(t);
                }
            }
        }
        return next;
    }

    @Override
    public void remove() {

    }
}
