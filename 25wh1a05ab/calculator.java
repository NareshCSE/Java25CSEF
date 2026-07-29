package mypackage5AB;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);//creating scanner object
		System.out.println("enter the 1st number");
		int num1=input.nextInt();//converting incoming
		System.out.println("the 1st number is "+num1);
		System.out.println("enter 2nd number");
		int num2=input.nextInt();
		System.out.println("the 2nd number is "+num2);
        System.out.println("enter operator ");
        String operator=input.next();
		switch(operator){
		case ( "+"):
			int sum=num1+num2;
			System.out.println(sum);
			break;
		case ("-"):
			int sub=num1-num2;
		    System.out.println(sub);
		    break;
		case("*"):
		    int multi=num1*num2;
		    System.out.println(multi);
		    break;
		case("/"):
			int div=num1/num2;
		    System.out.println(div);
		    break;
		case("%"):
			int rem=num1%num2;
		    System.out.println(rem);
		    break;
				}
		
	}
}
