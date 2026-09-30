package myproject5at;
import java.util.Random;

class SharedData {
    int number;
}

class NumberGenerator extends Thread {
    private SharedData data;

    NumberGenerator(SharedData data) {
        this.data = data;
    }

    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            synchronized (data) {
                data.number = random.nextInt(100);
                System.out.println("Generated number: " + data.number);

                if (data.number % 2 == 0) {
                    data.notifyAll();
                } else {
                    data.notifyAll();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Square extends Thread {
    private SharedData data;

    Square(SharedData data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            synchronized (data) {
                try {
                    data.wait();

                    if (data.number % 2 == 0) {
                        System.out.println("Square of " + data.number +
                                           " = " + (data.number * data.number));
                    }
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}

class Cube extends Thread {
    private SharedData data;

    Cube(SharedData data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            synchronized (data) {
                try {
                    data.wait();

                    if (data.number % 2 != 0) {
                        System.out.println("Cube of " + data.number +
                                           " = " + (data.number * data.number * data.number));
                    }
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        NumberGenerator t1 = new NumberGenerator(data);
        Square t2 = new Square(data);
        Cube t3 = new Cube(data);

        t1.start();
        t2.start();
        t3.start();
    }
}
