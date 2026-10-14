package mypackage;
class shared {
    int value;
    boolean available = false;
}

class produce extends Thread {
    shared s;

    produce(shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (s) {
                while (s.available) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                s.value = i;
                s.available = true;
                System.out.println("Produced = " + i);
                s.notifyAll();
            }
        }
    }
}

class consumer extends Thread {
    shared s;

    consumer(shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (s) {
                while (!s.available) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.println("Consumed = " + s.value);
                s.available = false;
                s.notifyAll();
            }
        }
    }
}

public class program17{
    public static void main(String[] args) {
        shared s = new shared();

        produce p = new produce(s);
        consumer c = new consumer(s);

        p.start();
        c.start();
    }
}
