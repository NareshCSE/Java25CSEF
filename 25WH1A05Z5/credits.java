package z5;

import java.util.Scanner;

class CNSException extends Exception{
	CNSException(){
		System.out.println("credits not sufficient");
		
	}
}
public class Credits {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
 
public static void main(String[] args) throws CNSException  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter credits");
	int credits=sc.nextInt();
	if(credits<50) {
		throw new CNSException();
	}
	else {
		System.out.println("credits sufficient");
	}


}
}

