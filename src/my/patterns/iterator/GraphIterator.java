package my.patterns.iterator;

public interface GraphIterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
