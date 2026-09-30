package mypackage5aq;

import java.util.Scanner;

class BankAccount {
    int accNo;
    String name;
    String aadhaar;
    String pan;
    double balance;
    String statement = "";

    void createAccount(int no, String n, String ad, String p, double bal) {
        accNo = no;
        name = n;
        aadhaar = ad;
        pan = p;
        balance = bal;
        statement = "Account Created with Balance: " + bal + "\n";
    }

    void deposit(double amt) {
        balance += amt;
        statement += "Deposited: " + amt + "\n";
        System.out.println("Amount Credited Successfully.");
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            statement += "Withdrawn: " + amt + "\n";
            System.out.println("Amount Debited Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    void showBalance() {
        System.out.println("Balance = " + balance);
    }

    void miniStatement() {
        System.out.println("Mini Statement:");
        System.out.println(statement);
        System.out.println("Current Balance: " + balance);
    }
}

public class Bank_applicaton {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount[] acc = new BankAccount[10];
        int count = 0;

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Mini Statement");
            System.out.println("6. Transfer Money");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    acc[count] = new BankAccount();

                    System.out.print("Enter Account Number: ");
                    int no = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Aadhaar Number: ");
                    String aadhaar = sc.nextLine();

                    System.out.print("Enter PAN Number: ");
                    String pan = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    acc[count].createAccount(no, name, aadhaar, pan, bal);
                    count++;

                    System.out.println("Account Created Successfully.");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    no = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (acc[i].accNo == no) {
                            System.out.print("Enter Amount: ");
                            double amt = sc.nextDouble();
                            acc[i].deposit(amt);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    no = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (acc[i].accNo == no) {
                            System.out.print("Enter Amount: ");
                            double amt = sc.nextDouble();
                            acc[i].withdraw(amt);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    no = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (acc[i].accNo == no) {
                            acc[i].showBalance();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    no = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (acc[i].accNo == no) {
                            acc[i].miniStatement();
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter Source Account Number: ");
                    int source = sc.nextInt();

                    System.out.print("Enter Destination Account Number: ");
                    int dest = sc.nextInt();

                    System.out.print("Enter Transfer Amount: ");
                    double amount = sc.nextDouble();

                    BankAccount s = null, d = null;

                    for (int i = 0; i < count; i++) {
                        if (acc[i].accNo == source)
                            s = acc[i];
                        if (acc[i].accNo == dest)
                            d = acc[i];
                    }

                    if (s != null && d != null) {
                        if (s.balance >= amount) {
                            s.balance -= amount;
                            d.balance += amount;

                            s.statement += "Transferred " + amount + " to A/C " + dest + "\n";
                            d.statement += "Received " + amount + " from A/C " + source + "\n";

                            System.out.println("Amount Transferred Successfully.");
                        } else {
                            System.out.println("Insufficient Balance.");
                        }
                    } else {
                        System.out.println("Invalid Account Number.");
                    }
                    break;

                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
