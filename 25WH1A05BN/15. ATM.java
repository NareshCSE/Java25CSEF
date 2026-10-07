package myproject;

import java.util.Scanner;

class PinMismatchException extends Exception {

    PinMismatchException(String message) {
        super(message);
    }
}

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 0;

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            try {

                if (pin != correctPin) {
                    attempts++;

                    throw new PinMismatchException("Incorrect PIN");
                }

                System.out.println("PIN Correct");
                System.out.println("Welcome " + name);
                break;

            } catch (PinMismatchException e) {

                System.out.println(e.getMessage());

                if (attempts == 3) {
                    System.out.println(
                        "Sorry..Your Account Has been Locked"
                    );
                }
            }
        }
    }
}
