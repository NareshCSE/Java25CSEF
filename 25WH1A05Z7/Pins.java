package mypackage5z7;

import java.util.Scanner;

class PinmismatchException extends RuntimeException{
	
}
public class Pins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pin=7801;
		int no_of_attempts = 0;
		System.out.println("enter your name");
		String name= sc.nextLine();
		while(no_of_attempts<3) {
			System.out.println("enter your pin");
			int pin1 = sc.nextInt();
			no_of_attempts++;
			if(pin1 == pin) {
				System.out.println("pin is matched");
				break;
			}
			else {
				System.out.println("pin is wrong");
			
			if(no_of_attempts>=3) {
				throw new PinmismatchException();
			}
			}
			
		}

	}

}
