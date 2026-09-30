package mypackage5cj;
import java.util.Scanner;
class PinMismatchException extends Exception {
    PinMismatchException(String message) {
        super(message);
    }
}
public class ATM {
    public static void main(String[] args) throws PinMismatchException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Correct PIN: ");
        int correctPin = sc.nextInt();
        int attempts= 0;
        while(attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin==correctPin) {
                System.out.println("Welcome " + name);
                System.out.println("PIN is correct.");
                System.out.println("Access Granted.");
                break;
            } 
            else {
                attempts++;
                System.out.println("Incorrect PIN.");
                if (attempts== 3) {
                    throw new PinMismatchException("Sorry..Your Account Has been Locked");
                }
                System.out.println("You have " +(3 - attempts) + " attempt(s) remaining.");
            }
        }
    }
}
