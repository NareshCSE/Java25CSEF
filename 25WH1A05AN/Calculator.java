package mypackage5an;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("25WH1A05AN");
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number 1");
		int number1=input.nextInt();
		System.out.println("Enter number 2");
		int number2=input.nextInt();
		System.out.println("Enter operator");
		char operator=input.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("the sum of "+number1+" and "+ number2+" is:"+(number1+number2));
			break;
		case '-':
			System.out.println("the difference of "+number1+" and "+ number2 +" is:"+(number1-number2));
			break;
		case '*':
			System.out.println("the product of "+number1+" and "+ number2 +" is:"+(number1*number2));
			break;
		case '/':
			System.out.println("the quotient of "+number1+" and "+ number2 +" is:"+(number1/number2));
			break;
		
		}

	}

}
