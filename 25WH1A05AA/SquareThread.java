package oopj_05aa;

public class SquareThread extends Thread {
    @Override
    public void run() {
        int val = NumberGenerator.number;
        System.out.println("Square of " + val + " = " + (val * val));
    }
}