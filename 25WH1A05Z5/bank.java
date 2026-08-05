package mypackage5z5;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 Random input1=new Random();
		int  opt,amount=10000;
		int accno=input1.nextInt(100000000,999999999);
		do {
			System.out.println("1.create an account\n"
				+ "2.debit amount\n"
					+ "3.credit amount\n"
				+ "4.view blance\n"
					+ "5.transfer amount\n"
					+ "6.exit\n");
		System.out.println("enter an option");
		opt=input.nextInt();
		switch(opt) {
		case 1:
			System.out.println("enter name");
			String name=input.next();
			System.out.println("enter aadhar no.");
			int aadhar=input.nextInt();
			System.out.println("enter pan number");
			int pan=input.nextInt();
			System.out.println("account number is ");
			
	        System.out.println(accno);
		    break;
		
		case 2:
			System.out.println("enter amount to be debited");
			int debitedAmount=input.nextInt();
			amount-=debitedAmount;
		
            System.out.println("the amount"+amount);
            break;
		case 3:
			System.out.println("enter amount to be credited");
			int credited=input.nextInt();
			amount+=credited;
			System.out.println("theamount is"+amount);
			break;
		case 4:
			System.out.println("the balance amount is"+amount);
			break;
		case 5:
			System.out.println("enter the account to which amount to be credited");
			int account2=input.nextInt();
			System.out.println("enter amount");
			int amount1=input.nextInt();
			System.out.println("enter account number");
			int accno1=input.nextInt();
		if(accno1==accno) {
			System.out.println(amount1 +"rupees debited from"+accno1+"and credited to"+account2);
			amount-=accno1;
		}
		else {
			System.out.println("wrong account number");
		}
			break;
		default:
			System.out.println("exited");
			
			}
		
		}while(opt<6);

	}

}
