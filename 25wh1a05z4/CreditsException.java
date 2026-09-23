package myproject5z4;

import java.util.Scanner;

class CreditsNotSufficientException extends Exception {
		CreditsNotSufficientException() {
			System.out.println("Credits are not sufficient");
		}
	}
	class CreditsException {
		public static void main(String[]args) throws CreditsNotSufficientException {
			Scanner input=new Scanner(System.in);
			System.out.println("enter credits:");
			int credits=input.nextInt();
			if(credits<50) {
				throw new CreditsNotSufficientException();
			}
		}

}
