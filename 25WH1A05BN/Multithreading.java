package myproject;

import java.util.Random;

class NumberThread extends Thread {

    public void run() {

        Random r = new Random();

        for (int i = 1; i <= 5; i++) {

            int n = r.nextInt(100);

            System.out.println("Number: " + n);

            if (n % 2 == 0) {
                new SquareThread(n).start();
            } else {
                new CubeThread(n).start();
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class SquareThread extends Thread {

    int n;

    SquareThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square: " + (n * n));
    }
}

class CubeThread extends Thread {

    int n;

    CubeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube: " + (n * n * n));
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        NumberThread t = new NumberThread();

        t.start();
    }
}
