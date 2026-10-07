package oopj_05aa;

public class CubeThread extends Thread {
    @Override
    public void run() {
        int val = NumberGenerator.number;
        System.out.println("Cube of " + val + " = " + (val * val * val));
    }
}