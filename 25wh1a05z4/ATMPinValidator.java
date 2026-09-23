package myproject5z4;

import java.util.Scanner;

class PinMismatchException extends Exception {
	public PinMismatchException(String message) {
		super(message);
	}
}
public class ATMPinValidator {
	private static final String correct_name="Ronny";
	private static final String correct_pin="1234";
	private static final int max_attempts=3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.print("Enter acc holder's name:");
	String name=input.nextLine();
	if(!name.equalsIgnoreCase(correct_name)) {
		System.out.println("Error:Acc holder name not found");
		input.close();
		return;
	}
	int attempts = 0;
    boolean isAuthenticated = false;

    while (attempts < max_attempts) {
        System.out.print("Enter your 4-digit PIN: ");
        String enteredPin = input.nextLine();
        attempts++;
        
        if (enteredPin.equals(correct_pin)) {
            System.out.println("\nAuthentication Successful! Welcome, " + name + ".");
            isAuthenticated = true;
            break;
        } else {
            int remainingAttempts = max_attempts - attempts;
            if (remainingAttempts > 0) {
                System.out.println("Incorrect PIN. Attempts remaining: " + remainingAttempts + "\n");
            }
	}
}
    if (!isAuthenticated) {
        try {
            throw new PinMismatchException("Sorry..Your Account Has been Locked.");
        } catch (PinMismatchException e) {
            System.err.println("\nException: " + e.getMessage());
        }
    }

    input.close();
}
}
