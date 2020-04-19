package my.patterns.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<T, List<T>> map;

    public Graph() {
        map = new HashMap<>();
    }
    public List<T> getNeighbours(T t){
        return map.get(t);
    }

    public void addNode(T from, T to) {
        if (from != null) {
            List<T> list = map.get(from);
            if (list == null){
                list = new ArrayList<>();
            }
            list.add(to);
            map.put(from, list);
        }
    }

    @Override
    public String toString() {
        StringBuilder graphs = new StringBuilder();
        map.forEach((k,v) -> graphs.append(k + ": " + v + "\n"));
        return graphs.toString();
    }
}
