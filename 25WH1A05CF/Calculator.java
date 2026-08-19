package mypackage5cf;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("enter the number");
		int number1=input.nextInt();
		int number2=input.nextInt();
		System.out.println("enter your choice");
		int choice=input.nextInt();
		int result=0;
		switch(choice) {
		case 1:result=number1+number2;
		break;
		case 2:result=number1-number2;
		break;
		case 3:result=number1*number2;
		break;
		case 4:result=number1/number2;
		break;
		case 5:result=number1%number2;
		break;
			
		}
		System.out.println(result);
		
		

	}

}
