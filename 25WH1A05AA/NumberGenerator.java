package oopj_05aa;

import java.util.Random;

public class NumberGenerator extends Thread {
    public static int number;
    public static boolean hasNewNumber = false;

    @Override
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                number = rand.nextInt(100);
                System.out.println("Generated: " + number);
                hasNewNumber = true;

                if (number % 2 == 0) {
                    SquareThread t2 = new SquareThread();
                    t2.start();
                } else {
                    CubeThread t3 = new CubeThread();
                    t3.start();
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Generator Interrupted");
        }
    }
}