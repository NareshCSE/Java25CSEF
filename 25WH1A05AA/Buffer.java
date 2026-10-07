package oopj_05aa;

public class Buffer {
    private int item;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        item = value;
        System.out.println("Produced: " + item);
        hasData = true;
        notify();
    }

    public synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + item);
        hasData = false;
        notify();
    }
}