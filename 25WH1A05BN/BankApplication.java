package myproject;

import java.util.Scanner;

class Account {
    int accNo;
    String name;
    String aadhaar;
    String pan;
    double balance;

    Account(int accNo, String name, String aadhaar, String pan) {
        this.accNo = accNo;
        this.name = name;
        this.aadhaar = aadhaar;
        this.pan = pan;
        balance = 0;
    }
}

public class BankApplication {

    static Scanner sc = new Scanner(System.in);
    static Account[] accounts = new Account[10];
    static int count = 0;

    static Account findAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accNo == accNo)
                return accounts[i];
        }
        return null;
    }

    public static void main(String[] args) {

        int choice;
        double amount;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Mini Statement / Balance");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Aadhaar Number: ");
                String aadhaar = sc.nextLine();

                System.out.print("Enter PAN Number: ");
                String pan = sc.nextLine();

                accounts[count] = new Account(accNo, name, aadhaar, pan);
                count++;

                System.out.println("Account created successfully!");
                break;

            case 2:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();

                Account a = findAccount(accNo);

                if (a != null) {
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();

                    a.balance = a.balance + amount;
                    System.out.println("Amount credited successfully!");
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 3:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();

                a = findAccount(accNo);

                if (a != null) {
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();

                    if (amount <= a.balance) {
                        a.balance = a.balance - amount;
                        System.out.println("Amount debited successfully!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 4:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();

                a = findAccount(accNo);

                if (a != null) {
                    System.out.println("Name: " + a.name);
                    System.out.println("Account Number: " + a.accNo);
                    System.out.println("Balance: " + a.balance);
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 5:
                System.out.print("Enter Source Account Number: ");
                int source = sc.nextInt();

                System.out.print("Enter Destination Account Number: ");
                int destination = sc.nextInt();

                System.out.print("Enter Transfer Amount: ");
                amount = sc.nextDouble();

                Account from = findAccount(source);
                Account to = findAccount(destination);

                if (from != null && to != null && amount <= from.balance) {
                    from.balance = from.balance - amount;
                    to.balance = to.balance + amount;

                    System.out.println("Amount transferred successfully!");
                } else {
                    System.out.println("Transfer failed!");
                }
                break;

            case 6:
                System.out.println("Thank you for using the bank application.");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}
