package myproject5bk;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number:");
		int number1=input.nextInt();
		System.out.println("enter the second number:");
		int number2=input.nextInt();
		System.out.println("enter 1 to add,2 to sub,3 to multi,4 to div");
		int option=input.nextInt();
		switch(option) {
		case 1:
			int sum=number1+number2;
			System.out.println("addition of numbers is:"+sum);
			break;
		case 2:
			int sub=0;
			if(number1>number2) {
			sub=number1-number2;
			}
			else {
				sub=number2-number1;}
			System.out.println("subtraction of numbers is:"+sub);
			break;
		case 3:
			int multi=number1*number2;
			System.out.println("multiplication of 2 numbers is:"+multi);
		    break;
		case 4:
			int div=number1%number2;
			System.out.println("division of 2 numbers is:"+div);
			break;
		}

	}

}
