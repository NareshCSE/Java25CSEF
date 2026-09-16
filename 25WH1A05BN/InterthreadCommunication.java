package myproject;

class Buffer {

    int value;
    boolean available = false;

    synchronized void produce(int value) {

        while (available) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        this.value = value;
        available = true;

        System.out.println("Produced: " + value);

        notify();
    }

    synchronized void consume() {

        while (!available) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Consumed: " + value);

        available = false;

        notify();
    }
}

class Producer extends Thread {

    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            b.produce(i);
        }
    }
}

class Consumer extends Thread {

    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            b.consume();
        }
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
