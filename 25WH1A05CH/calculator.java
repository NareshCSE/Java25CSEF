package mypackage5ch;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("enter the values of num1 and num2");
		num1=sc.nextInt();
		num2=sc.nextInt();
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case '+':
		    System.out.println(num1+num2);
		    break;
		case '-':
			System.out.println(num1-num2);
			 break;
		case '*':
			System.out.println(num1*num2);
			 break;
		case '%':
			System.out.println(num1%num2);
			 break;
		case '/':
			System.out.println(num1/num2);
			 break;
		}

	}

}