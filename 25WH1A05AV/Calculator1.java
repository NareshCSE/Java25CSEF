package mypackage;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number1=input.nextInt();
		System.out.println("enter a number: ");
		int number2=input.nextInt();
		System.out.println("enter choice: ");
		String choice=input.next();
		switch(choice) {
		case "+":
			System.out.println(number1+number2);
			break;
		case "-":
			System.out.println(number1-number2);
			break;
		case "*":
			System.out.println(number1*number2);
			break;
		case "/":
			System.out.println(number1/number2);
			break;
		case "%":
			System.out.println(number1%number2);
			break;

		}
	}
}
