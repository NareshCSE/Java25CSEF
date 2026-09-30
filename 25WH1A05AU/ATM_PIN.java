package myproject5au;

import java.util.Scanner;

class PinMismatchException extends Exception {

    PinMismatchException(String message) {
        super(message);
    }
}

public class ATM_PIN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accountHolderName = "Manashwini";
        int correctPin = 1234;

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("PIN is correct.");
                System.out.println("Welcome " + name);
                break;
            } 
            else {
                attempts++;

                try {
                    if (attempts == 3) {
                        throw new PinMismatchException(
                            "Sorry..Your Account Has been Locked"
                        );                    } 
                    else {
                        System.out.println("Incorrect PIN. Try again.");
                    }
                } 
                catch (PinMismatchException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        sc.close();
    }
}
