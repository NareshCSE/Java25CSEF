
package myproject5au;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a");
		int FirstValue=input.nextInt();
		System.out.println("the first number is "+FirstValue);
		System.out.println("Enter b");
		int SecondValue=input.nextInt();
		System.out.println("the second number is "+SecondValue);
		System.out.println("enter operations : + - * / %");
		char Operation=input.next().charAt(0);
		switch (Operation)
		{
		case '+':
			System.out.println("the sum is "+(FirstValue+SecondValue));
			break;
		case '-':
			System.out.println("the diff is "+(FirstValue-SecondValue));
			break;
		case '*':
			System.out.println("the prod is "+(FirstValue*SecondValue));
			break;
		case '/':
			System.out.println("the quo is"+(FirstValue/SecondValue));
			break;
		case '%':
			System.out.println("the reminder is "+(FirstValue%SecondValue));	
			break;
		default:
            System.out.println("Invalid operation");
    }

    input.close();			
		}
  }
	
