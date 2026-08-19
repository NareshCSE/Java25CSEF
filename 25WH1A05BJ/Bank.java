package mypackage;
import java.util.Scanner;
public class Bank 
{
	public static void main(String[]args)
	{
		int acc=(int)(Math.random()*1000000000);
		
		while(true)
		{
			System.out.println("Which task u want to perform");
			System.out.println("1.Create a bank account");
			System.out.println("2.Credit amount");
			System.out.println("3.Debiting Amount");
			System.out.println("4.View Mini Statement");
			System.out.println("5.Transfer amount");
			System.out.println("6.Exit");
			int n;
			Scanner in=new Scanner(System.in);
			n=in.nextInt();
			if(n==6)
			{
				break;
			}
			else
			{
				switch(n)
				{
					case 1:
						String b,a,p;
						System.out.println("Enter your Name");
						b=in.next();
						System.out.println("Enter Aadhar No.");
						a=in.next();
						System.out.println("Enter Pan No.");
						p=in.next();
						System.out.println("Your accNo.is"+acc);
						System.out.println("Account Succesfully Created");
						break;
					case 2:
						int ac;
						System.out.println("Enter account number");
						ac=in.nextInt();
						if(acc==ac)
						System.out.println("Money Succesfully Transfored");
						else
							System.out.println("invalid account number");
						
							
						break;
					case 3:
						String aa;
						System.out.println("Enter account number");
						aa=in.next();
						System.out.println("Money Succesfully debited");
						break;
					case 4:
						System.out.println("Your Bank Mini Statement");
						System.out.println("Monday:rs 300");
						break;
					case 5:
						System.out.println("Enter Source acc no.");
						String sc;
						sc=in.next();
						System.out.println("Enter reciver acc no.");
						String c;
						c=in.next();
						break;
						
				}
			}
		}
		System.out.print("Thank you");
		
	}
}
