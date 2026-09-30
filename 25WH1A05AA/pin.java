package oopj_aa;

import java.util.Scanner;
//Custom Exception Class
class PinMismatchException extends Exception {
 // Constructor passing message to super class (Exception)
 public PinMismatchException(String message) {
     super(message);
 }
}

public class pin {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Input Account Holder Name
     System.out.print("Enter Account Holder Name: ");
     String name = scanner.nextLine();

     int correctPin = 1234; // Preset valid PIN
     int attempts = 0;
     boolean success = false;

     // Try up to 3 times
     while (attempts < 3) {
         System.out.print("Enter PIN number: ");
         int pin = scanner.nextInt();
         attempts++;

         if (pin == correctPin) {
             success = true;
             System.out.println("Welcome " + name + "! PIN Validated Successfully.");
             break; // Exit loop on success
         } else if (attempts < 3) {
             System.out.println("Incorrect PIN. Try again (" + (3 - attempts) + " attempt(s) left).\n");
         }
     }

     
     try {
         if (!success) {
             throw new PinMismatchException("Sorry..Your Account Has been Locked.");
         }
     } catch (PinMismatchException e) {
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}