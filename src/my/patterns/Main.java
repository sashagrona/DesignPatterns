package my.patterns;

import my.patterns.iterator.BreadthFirstSearchIterator;
import my.patterns.iterator.DepthFirstSearchIterator;
import my.patterns.iterator.Graph;
import my.patterns.iterator.GraphIterator;

public class Main {

    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        graph.addNode(0, 1);
        graph.addNode(0, 9);
        graph.addNode(1,8);
        graph.addNode(9, 8);
        graph.addNode(8, 7);
        graph.addNode(7,10);
        graph.addNode(10, 11);
        graph.addNode(11, 7);
        graph.addNode(7, 3);
        graph.addNode(3, 4);
        graph.addNode(3, 2);
        graph.addNode(3, 5);
        graph.addNode(5, 6);
        graph.addNode(6, 7);
        System.out.println(graph.toString());
        GraphIterator<Integer> graphIterator = new BreadthFirstSearchIterator<>(0, graph);
        while (graphIterator.hasNext()){
            System.out.println(graphIterator.next());
        }
    }
}
