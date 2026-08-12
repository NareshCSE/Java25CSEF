package myproject5bk;

import java.util.Scanner;

public class Bankmenu {
static int balance,credamount,total;
static double acn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int option;
		do {
		System.out.println("1:create account\n2:creadit amount\n3:debit amount\n4:balane enquiry\n5:transfer fund to account number\n6:EXIT");
		System.out.println("enter the option:");
		option=input.nextInt();	
		switch(option) {
		case 1:
		System.out.println("enter your name:");
		String name=input.next();
		System.out.println("enter your aadhaar number:");
		double aadhaar=input.nextDouble();
		System.out.println("enter your pan number:");
		double pan=input.nextDouble();
		System.out.println("enter a new account number to create");
		double acn=input.nextDouble();
		System.out.println("minimum amount to be in account is 1000");
		total=input.nextInt();
		break;
		case 2:
			System.out.println("enter your account number:");
			acn=input.nextDouble();
			System.out.println("enter the crediting amount:");
			credamount=input.nextInt();
			total=total+credamount;
			System.out.println("total amount is:"+total);
			break;
		case 3:
			System.out.println("enter the debiting amount:");
			int debamount=input.nextInt();
			total=total-debamount;
			System.out.println("the balance amount is:"+total);
			break;
		case 4:
			System.out.println("the amount in your account is:"+total);
			break;
		case 5:
			System.out.println("enter the account number to transfer fund:");
			double tracn=input.nextDouble();
			System.out.println("enter the amount to be transfer:");
			int tramount=input.nextInt();
			total=balance-tramount;
			System.out.println("the amount is tranfered to the "+tracn);
			break;
		}
		
	}while(option<6);
}
}