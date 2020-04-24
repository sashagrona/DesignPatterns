package my.patterns.mediator;

import java.util.concurrent.atomic.AtomicInteger;

public class MediatorImpl implements Mediator {
    private boolean isRetrieved = false;
    private AtomicInteger number;

    @Override
    public synchronized void storeNumber(int num) {
        while (isRetrieved){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isRetrieved = true;
        number = new AtomicInteger(num);
        notifyAll();
    }

    @Override
    public synchronized AtomicInteger retrieveNumber() {
        while (!isRetrieved){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isRetrieved = false;
        notifyAll();
        return number;
    }
}
