package mypackage5ae;

import java.util.Scanner;

public class Bank_application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		int Account_number=0,amt=100000,result;
		int option;
		
		do 
		{	
			System.out.println("******************MENU******************");
			System.out.println("Account Creation");
			System.out.println("Crediting an Amount");
			System.out.println("Debiting an Amount");
			System.out.println("Viewing a mini statement");
			System.out.println("Transferring Funds");
			System.out.println("EXIT");
			System.out.println("****************************************");
			System.out.println("Enter option from MENU");
			option=input.nextInt();
			switch(option) {
			case 1:
				System.out.println("Account Creation");
				System.out.println("Enter your Name");
				String name=input.next();
				System.out.println("Enter your Aadhar number");
				int aadhar=input.nextInt();
				System.out.println("Enter your Pan number");
				int pan=input.nextInt();
				System.out.println("Name:"+name);
				System.out.println("Aadhar number"+aadhar);
				System.out.println("Pan card number");
				break;
				
			case 2:System.out.println("Creaditing an ammout");
				System.out.println("Enter Account number");
				int Accunt_number=input.nextInt();
					
					if( Accunt_number==123123)
					{
					System.out.println("Enter amount to creadit");
					int ammount=input.nextInt();
					System.out.print(ammount);
					System.out.println("got creadited");
					break;
					}
			case 3:System.out.println("Debiting an ammout");
				System.out.println("Enter Account number");
				int accunt_number=input.nextInt();
				
				if( accunt_number==123123)
				{
					System.out.println("Enter amount to debit");
					int ammount=input.nextInt();
					System.out.print(ammount);
					System.out.println("got debited");
				}
					break;
				
			case 4:System.out.println("Balance Equiry");
				System.out.println("Enter Account number");
				int acunt_number=input.nextInt();

				if( acunt_number==123123)
				{
					System.out.println("Total ammount present in bank is"+amt);
				}	
				break;
			case 5:
				System.out.println("Transsfering Funds");
				System.out.println("Enter source account number");
				int Acc_number=input.nextInt();
				if(Acc_number==123123) {
					System.out.println("Enter Destination account number");
					int Acc2_number=input.nextInt();
					
					System.out.println("Enter ammount to transfer");
					int amountt=input.nextInt();
					System.out.print(amountt);
					System.out.println("got transfered to account with number"+Acc2_number);
				}	
				break;
			
			
			
			}
			
		
		}while(option<6);

	}
}	
