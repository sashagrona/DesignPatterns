package my.patterns.mediator;

public class Consumer implements Runnable {
    private Mediator mediator;

    public Consumer(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Consumer retrieved - " + mediator.retrieveNumber().get() + " iteration:" + i);
        }
    }
}
