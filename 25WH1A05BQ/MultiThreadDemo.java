package mypackage5bq;


import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random r = new Random();

        try {
            for (int i = 0; i < 5; i++) {
                int num = r.nextInt(100);

                System.out.println("\nGenerated Number: " + num);

                if (num % 2 == 0) {
                    SquareThread t2 = new SquareThread(num);
                    t2.start();
                } else {
                    CubeThread t3 = new CubeThread(num);
                    t3.start();
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class SquareThread extends Thread {
    int num;

    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square of " + num + " = " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NumberGenerator t1 = new NumberGenerator();
        t1.start();
    }
}

