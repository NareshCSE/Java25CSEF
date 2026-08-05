package mypackage5at;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 String name = "";
	     String aadhaar = "";
	     String pan = "";
	     int accountNumber = 0;
	     double balance = 0;

	     int choice;
	     
	     do {
	            System.out.println("\n===== BANK MENU =====");
	            System.out.println("1. Create Account");
	            System.out.println("2. Credit Amount");
	            System.out.println("3. Debit Amount");
	            System.out.println("4. Balance Enquiry / Mini Statement");
	            System.out.println("5. Fund Transfer");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            
	            switch(choice) {
	            
	            case 1:
	            	sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Aadhaar Number: ");
                    aadhaar = sc.nextLine();

                    System.out.print("Enter PAN Number: ");
                    pan = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter Initial Deposit: ");
                    balance = sc.nextDouble();

                    System.out.println("Account Created Successfully!");
                    break;
                    
	            case 2:
	            	System.out.print("Enter Account Number");
	            	int acc=sc.nextInt();
	            			
	                if(acc==accountNumber)
	                {
	                	System.out.println("Enter Amount to Credit");
	                	double credit = sc.nextDouble();
                        balance = balance + credit;
                        System.out.println("Amount Credited Successfully!");
                    } else {
                        System.out.println("Invalid Account Number!");
                    }
                    break;
	            case 3:
	            	System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    if (acc == accountNumber) {
                        System.out.print("Enter Amount to Debit: ");
                        double debit = sc.nextDouble();

                        if (debit <= balance) {
                            balance = balance - debit;
                            System.out.println("Amount Debited Successfully!");
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                    } else {
                        System.out.println("Invalid Account Number!");
                    }
                    break;
	            case 4:
	            	System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    if (acc == accountNumber) {
                        System.out.println("\n----- MINI STATEMENT -----");
                        System.out.println("Customer Name : " + name);
                        System.out.println("Account Number: " + accountNumber);
                        System.out.println("Balance        : " + balance);
                    } else {
                        System.out.println("Invalid Account Number!");
                    }
                    break;
	            case 5:
	            	 System.out.print("Enter Source Account Number: ");
	                    int source = sc.nextInt();

	                    System.out.print("Enter Destination Account Number: ");
	                    int destination = sc.nextInt();

	                    System.out.print("Enter Transfer Amount: ");
	                    double amount = sc.nextDouble();

	                    if (source == accountNumber) {
	                        if (amount <= balance) {
	                            balance = balance - amount;
	                            System.out.println("Rs." + amount + " Transferred Successfully to Account " + destination);
	                        } else {
	                            System.out.println("Insufficient Balance!");
	                        }
	                    } else {
	                        System.out.println("Invalid Source Account!");
	                    }
	                    break;
	            case 6:
	            	System.out.println("Thank You for Using Bank Application!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

	                }
	     }while(choice!=6);
	     sc.close();
	}

}
