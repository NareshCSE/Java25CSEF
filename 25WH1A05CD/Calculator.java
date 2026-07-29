package mypackage5cd;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many times the operations must be done!!");
		int x=input.nextInt();
		System.out.println("Enter two numbers:");
		int number1=input.nextInt();
		int number2=input.nextInt();
		for(int i=0;i<x;i++) {
		System.out.println("Choose operation: Add(1)\nSubtract(2)\nProduct(3)\nDivision(4)");
		int operation=input.nextInt();
		int key=5;
		switch(operation) {
		case 1:
			int sum=number1+number2;
			System.out.println("Addition is "+sum);
			break;
		case 2:
			int subtraction=number1-number2;
			System.out.println("Subtraction is "+subtraction);
			break;
		case 3:
			int product=number1*number2;
			System.out.println("Product is "+product);
			break;
		case 4:
			int division=number1/number2;
			System.out.println("Division is "+division);
			break;
		};
		}
	
	
		
		}
		
		// TODO Auto-generated method stub

	}
