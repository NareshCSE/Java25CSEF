package myproject5bc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter first number:");
		Scanner input=new Scanner(System.in);
		int number1=input.nextInt();
		
		System.out.println("Enter second number:");
        int number2=input.nextInt();

		System.out.println("Enter the operator:");

		char operator=input.next().charAt(0);

		switch(operator) {

		case'+':

		System.out.println("Sum of "+number1+" and "+number2+" is:"+(number1+number2));

		break;

		case'-':

		System.out.println("Difference of "+number1+" and "+number2+" is:"+(number1-number2));

		break;

		case'*':

		System.out.println("Multiplication of "+number1+" and "+number2+" is:"+(number1*number2));

		break;
		
		case'\':
		
		System.out.println("division of "+number1" and "+number2+"is:"+(number1\number2));
		break;
		

		}


		

	}

}
