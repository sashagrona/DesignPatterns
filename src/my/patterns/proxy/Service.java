package my.patterns.proxy;

import java.util.List;

public interface Service<T> {
    List<T> getAll();
}
