package mypackage5ap;
import java.util.Scanner;

public class Bank_Applications {

    static Scanner sc = new Scanner(System.in);
    static double balance = 0;
    static int accountNo = 1001;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- BANK APPLICATION ---");
            System.out.println("1. Create Account");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Aadhaar Number: ");
                    String aadhaar = sc.nextLine();

                    System.out.print("Enter PAN Number: ");
                    String pan = sc.nextLine();

                    System.out.println("Account Created Successfully!");
                    System.out.println("Account Number: " + accountNo++);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double credit = sc.nextDouble();

                    balance = balance + credit;
                    System.out.println("Amount Credited Successfully!");
                    break;

                case 3:
                    System.out.print("Enter Amount: ");
                    double debit = sc.nextDouble();

                    if (debit <= balance) {
                        balance = balance - debit;
                        System.out.println("Amount Debited Successfully!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.println("Balance: Rs." + balance);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
