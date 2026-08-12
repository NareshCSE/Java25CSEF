package mypackage5z2;
import java.util.Scanner;
public class BankApllication {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		        Scanner scanner = new Scanner(System.in);

		        String name = "";
		        String aadhaar = "";
		        String pan = "";
		        int accNo = 0;
		        double balance = 0;

		        int choice;

		        do {
		            System.out.println("\n1.Create Account");
		            System.out.println("2.Credit");
		            System.out.println("3.Debit");
		            System.out.println("4.Balance");
		            System.out.println("5.Exit");
		            System.out.print("Enter Choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {

		                case 1:
		                    System.out.print("Account Number: ");
		                    accNo = scanner.nextInt();
		                    scanner.nextLine();

		                    System.out.print("Name: ");
		                    name = scanner.nextLine();

		                    System.out.print("Aadhaar: ");
		                    aadhaar = scanner.nextLine();

		                    System.out.print("PAN: ");
		                    pan = scanner.nextLine();

		                    System.out.print("Initial Balance: ");
		                    balance = scanner.nextDouble();

		                    System.out.println("Account Created Successfully");
		                    break;
                                 
		                case 2:
		                    System.out.print("Enter Amount: ");
		                    balance += scanner.nextDouble();
		                    System.out.println("Amount Credited");
		                    break;

		                case 3:
		                    System.out.print("Enter Amount: ");
		                    double amt = scanner.nextDouble();

		                    if (amt <= balance) {
		                        balance -= amt;
		                        System.out.println("Amount Debited");
		                    } else {
		                        System.out.println("Insufficient Balance");
		                    }
		                    break;

		                case 4:
		                    System.out.println("Account Number: " + accNo);
		                    System.out.println("Name: " + name);
		                    System.out.println("Balance: " + balance);
		                    break;

		                case 5:
		                	System.out.println("Thank you");
		                default:
		                    System.out.println("Invalid Choice");
		            }

		        } while (choice != 5);
		    }
}
	

