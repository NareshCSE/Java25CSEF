package mypackage5ce;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int number1=input.nextInt();
		int number2=input.nextInt();
		System.out.println("Choose the operation");
		int operation=input.nextInt();
		int result=0;
		switch(operation) {
		case 1:
			result=number1+number2;
			break;
		case 2:
			result=number1-number2;
			break;
		case 3:
			result=number1*number2;
			break;
		case 4:
			result=number1/number2;
			break;
		case 5:
			result=number1%number2;
			break;
			 
			
		}
			System.out.println(result);
		}
	 
		

	}


