package mypackage5bd;
import java.util.Random;
class Numberthread extends Thread{
	Random input=new Random();
	public void run() {
		while(true) {
			int n=input.nextInt();
			if(n%2==0) {
				squarethread s=new squarethread(n);
				s.start();
			}
			else {
				cubethread c=new cubethread(n);
	            c.start();
			}
		}
	}
}
class squarethread extends Thread{
	int n;
	squarethread(int n){
	this.n=n;
	}

	public void run(){
		int square=n*n;
		System.out.println("square of "+ n +"="+square);
	}
}
class cubethread extends Thread{
	int n;
	cubethread(int n){
		this.n=n;
	}
	public void run() {
		int cube=n*n*n;
		System.out.println("cube of"+ n +"="+cube);
	}
}
public class Namethread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Numberthread t=new Numberthread();
             t.start();
	}

}
