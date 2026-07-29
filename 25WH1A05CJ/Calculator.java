package mypackage5cj;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=input.nextInt();
		System.out.println("Enter the second number:");
		int b=input.nextInt();
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for substraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division");
		System.out.println("Enter the operator ");
		int opt=input.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Addition "+(a+b));
				break;
			case 2:
				System.out.println("substraction "+(a-b));
				break;
			case 3:
				System.out.println("multiplication "+(a*b));
				break;	
			case 4:
				System.out.println("division "+(a/b));
				break;	
	}
}
}
