package mypackage5bd;	
import java.util.Scanner;
class PinMisMatchException extends RuntimeException{
	PinMisMatchException(){
		System.out.println("your Account is locked");
	}
}

public class Atmpin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int fixedPin=345;
		int c=0;
   for(int i=0;i<3;i++){
    	System.out.println("enter pin");
    	int Pin=input.nextInt();
    if(Pin!=fixedPin) {
    	c=c+1;
    }
    else {
    	System.out.println("your pin is coorect");
    	break;
    }
	}
    if(c==3) {
    	throw new PinMisMatchException();
    }
	}
}
	
