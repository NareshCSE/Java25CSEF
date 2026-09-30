package mypakage;

import java.util.Scanner;
import java.util.scanner;

class PinmismatchException extends RuntimeException{
}

public class Pins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pin=7801;
		int no_of_attempts = 0;
		while(no_of_attempts<3) {
			System.out.println("enter your pin");
			int pin1 = sc.nextInt();
			no_of_attempts++;
			if(pin1==pin) {
				System.out.println("pin is matched");
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
