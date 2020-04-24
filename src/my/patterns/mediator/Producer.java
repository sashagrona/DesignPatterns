package my.patterns.mediator;

public class Producer implements Runnable {
    private Mediator mediator;
    private int num;

    public Producer(Mediator mediator, int initial) {
        this.mediator = mediator;
        this.num = initial;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            mediator.storeNumber(num);
            System.out.println("Producer stored " + num++ + " iteration:" + i);
        }
    }
}
