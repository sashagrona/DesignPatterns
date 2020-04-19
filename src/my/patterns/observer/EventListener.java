package my.patterns.observer;

import java.io.File;

public interface EventListener {
    void update(String operation, File file);
}
