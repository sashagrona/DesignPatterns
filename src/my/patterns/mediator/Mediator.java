package my.patterns.mediator;

import java.util.concurrent.atomic.AtomicInteger;

public interface Mediator {
    void storeNumber(int num);
    AtomicInteger retrieveNumber();
}
