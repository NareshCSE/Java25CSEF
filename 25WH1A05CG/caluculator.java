package mypackage5cg;

import java.util.Scanner;

public class caluculator {
 public static void main(String[] args) {
	 Scanner inputs = new Scanner(System.in);
	 int number1;
	 int number2;
	 System.out.println("enter the numbers: ");
	 number1= inputs.nextInt();
	 number2=inputs.nextInt();
	 char ch;
	 ch = inputs.next().charAt(0);
	 double result;
	 switch(ch)
	 {
	 case '+':
		 System.out.println(number1+number2);
		break;
	 case'-':
		 System.out.println(number1-number2);
		 break;
	 case'*':
		 System.out.println(number1*number2);
		 break;
	 case'/':
		 System.out.println(number1/number2);
		 break;
	 }
 }
}
