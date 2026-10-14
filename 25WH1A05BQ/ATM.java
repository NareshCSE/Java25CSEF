package mypackage5bq;


import java.util.Scanner;

class PinMismatchException extends Exception {
    PinMismatchException(String msg) {
        super(msg);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int correctPin = 1234;
        int pin;
        int attempts = 0;

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        try {
            while (attempts < 3) {
                System.out.print("Enter ATM PIN: ");
                pin = sc.nextInt();

                if (pin == correctPin) {
                    System.out.println("Welcome " + name);
                    System.out.println("PIN Verified Successfully!");
                    break;
                } else {
                    attempts++;
                    System.out.println("Incorrect PIN!");

                    if (attempts == 3) {
                        throw new PinMismatchException(
                            "Sorry..Your Account Has been Locked."
                        );
                    }

                    System.out.println("Attempts remaining: "
                            + (3 - attempts));
                }
            }
        } catch (PinMismatchException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
