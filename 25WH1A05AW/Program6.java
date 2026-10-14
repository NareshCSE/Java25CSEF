package mypackage5aw;
import java.util.Scanner;
public class Program6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int account = 0;
        String name = "";
        String aadhaar = "";
        String pan = "";
        double balance = 0;
        int choice;
        do {
            System.out.println("\n1. Create Account");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    account = sc.nextInt();
                    System.out.print("Enter name: ");
                    name = sc.next();
                    System.out.print("Enter Aadhaar number: ");
                    aadhaar = sc.next();
                    System.out.print("Enter PAN number: ");
                    pan = sc.next();
                    System.out.println("Account created successfully");
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int acc1 = sc.nextInt();
                    if (acc1 == account) {
                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();
                        balance = balance + amount;
                        System.out.println("Amount credited successfully");
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int acc2 = sc.nextInt();
                    if (acc2 == account) {
                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();
                        if (amount <= balance) {
                            balance = balance - amount;
                            System.out.println("Amount debited successfully");
                        } else {
                            System.out.println("Insufficient balance");
                        }
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int acc3 = sc.nextInt();
                    if (acc3 == account) {
                        System.out.println("Name: " + name);
                        System.out.println("Balance: " + balance);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 5:
                    System.out.print("Enter source account: ");
                    int source = sc.nextInt();
                    System.out.print("Enter destination account: ");
                    int destination = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double transfer = sc.nextDouble();
                    if (source == account && transfer <= balance) {
                        balance = balance - transfer;
                        System.out.println("Amount transferred successfully");
                    } else {
                        System.out.println("Transfer failed");
                    }
                    break;
                case 6:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}
