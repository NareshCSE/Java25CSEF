package mypackage5ad;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
	        System.out.println("enter the 1st number");
	        int number1=input.nextInt();
	        System.out.println("enter the 2nd number");
	        int number2=input.nextInt();
	        System.out.println("the 1st number is "+number1);
	        System.out.println("the 2nd number is "+number2);
	       System.out.println("select:+,-,*,/");
	       String choice=input.next();
	       int result=0;
	       switch(choice)
	       {
	    	   case"+":
	    		   result=number1+number2;
	    		   break;
	    	   case"-":
	    		   result=number1-number2;
	    		   break;
	    	   case"*":
	    		   result=number1*number2;
	    		   break;
	    	   case"/":
	    		   result=number1/number2;
	    		   break;	         
	    		   
	       }
	       System.out.println("result="+result);
	}

}
