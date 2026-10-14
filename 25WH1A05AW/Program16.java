package mypackage5aw;
import java.util.Random;
class RandomThread extends Thread{
    public void run(){
        Random r = new Random();
        for(int i = 1; i <= 5; i++){
            int n = r.nextInt(100);
            System.out.println("Random Number: " + n);
            if(n % 2 == 0){
                new Even(n).start();
            }else{
                new Odd(n).start();
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Even extends Thread{
    int n;
    Even(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("Square: " + (n * n));
    }
}
class Odd extends Thread{
    int n;
    Odd(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("Cube: " + (n * n * n));
    }
}
public class Program16{
    public static void main(String[] args){
        RandomThread t = new RandomThread();
        t.start();
    }
}