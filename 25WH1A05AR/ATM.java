package mypackage5ar;
import java.util.Scanner;

class PinMismatchException extends Exception {
 PinMismatchException(String message) {
     super(message);
 }
}

public class ATM_PIN_Verification {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String accountHolderName = "sahasra";
     int correctPin = 2322;
     int attempts = 0;

     System.out.print("Enter Account Holder Name: ");
     String name = sc.nextLine();

     if (!name.equalsIgnoreCase(accountHolderName)) {
         System.out.println("Account Holder Not Found!");
         return;
     }

     while (attempts < 3) {
         System.out.print("Enter PIN: ");
         int pin = sc.nextInt();

         if (pin == correctPin) {
             System.out.println("PIN Verified Successfully!");
             System.out.println("Welcome " + accountHolderName);
             break;
         } else {
             attempts++;

             try {
                 if (attempts == 3) {
                     throw new PinMismatchException(
                         "Sorry..Your Account Has been Locked"
                     );
                 } else {
                     throw new PinMismatchException(
                         "Incorrect PIN! Attempts remaining: " + (3 - attempts)
                     );
                 }
             } catch (PinMismatchException e) {
                 System.out.println(e.getMessage());
             }
         }
     }

     sc.close();
 }
}
