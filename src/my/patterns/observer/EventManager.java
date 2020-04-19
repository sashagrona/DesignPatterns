package my.patterns.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<EventListener>> map;

    public EventManager(String... dbOperations) {
        map = new HashMap<>();
        for (String operation:dbOperations) {
            map.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String operation, EventListener user){
        List<EventListener> list = map.get(operation);
        list.add(user);
        map.put(operation, list);
    }
    public void unsubscribe(String operation, EventListener user){
        List<EventListener> list = map.get(operation);
        list.remove(user);
        map.put(operation, list);
    }
    public void notify(String operation, File file){
        List<EventListener> list = map.get(operation);
        for (EventListener user: list){
            user.update(operation, file);
        }
    }
}
