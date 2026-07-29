package my_package_678;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number:");
	int number1=input.nextInt();
	System.out.println("Enter second number");
    int number2=input.nextInt();
	int operator=input.nextInt();
	switch (operator) {
	case 1:
		System.out.println("Addition"+(number1+number2));
		break;
	case 2:
		System.out.println("Substraction"+(number1-number2));
		break;
	case 3:
		System.out.println("Multiplication"+(number1*number2));
		break;
	case 4:
		System.out.println("Division"+(number1/number2));
		break;
		
	}
	}
}
