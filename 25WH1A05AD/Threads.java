package mypackage5ad;



import java.util.Random;



class RandomNumber extends Thread{

	

	public void run() {

		Random rand = new Random();

		int boundedInt = rand.nextInt(100); 

		System.out.println("the random number:"+boundedInt);

		if (boundedInt % 2 == 0) {

            EvenSquare t2 = new EvenSquare(boundedInt);

            t2.start();

        } 

        else {

            OddCube t3 = new OddCube(boundedInt);

            t3.start();

        }

	}}



class EvenSquare extends Thread{

	int boundedInt;

	   EvenSquare(int boundedInt){

		   this.boundedInt=boundedInt;

	   } 



   public void run() {

	  System.out.println("the EvenSqaure is:"+boundedInt*boundedInt); 

   }



}

class OddCube extends Thread{

	int boundedInt;

	OddCube(int boundedInt){

		this.boundedInt = boundedInt;

	}

	public void run() {

		System.out.println("The odd cube is:"+boundedInt*boundedInt*boundedInt);

	}

}

public class Threads {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		 RandomNumber t1 = new RandomNumber();

	        t1.start();

	}



}
