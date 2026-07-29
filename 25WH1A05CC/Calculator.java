package mypackage5cc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many times the operations must go on :");
		int var=input.nextInt();
		for(int i=0;i<var;i++) {
		System.out.println("\nEnter the two numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("Enter the numbers \n1 for addition \n2 for subtraction \n3 for multiplication \n4 for division : \n");
	    int ch=input.nextInt();
	    switch(ch)
	    {
	    case 1:int add=num1+num2;
	    System.out.println("addition="+add);
	    break;
	    case 2:int sub=num1-num2;
	    System.out.println("subtraction="+sub);
	    break;
	    case 3:int mul=num1*num2;
	    System.out.println("multipilcation ="+mul);
	    break;
	    case 4 :int div=num1/num2;
	    System.out.println("division ="+div);
	    break;
	     }
		}
		
		
	}

}
