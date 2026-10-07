package mypackage5be;

import java.util.Scanner;

class PinMismatchException extends RuntimeException{
	 PinMismatchException(){
		System.out.println("Sorry..Your Account Has been Locked.");
	}
}

public class Atmpin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int fixedPin=579;
		int c=0;
   for(int i=0;i<3;i++){
    	System.out.println("Enter Pin");
    	int Pin=input.nextInt();
    if(Pin!=fixedPin) {
    	c=c+1;
    }
    else {
    	System.out.println("Pin is correct");
    	break;
  }

 }
    if(c==3) {
    	throw new PinMismatchException();
    }

	}
}
