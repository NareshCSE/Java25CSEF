package z5;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int res=0;
		System.out.println("enter first number");
		int num1=scanner.nextInt();
	    System.out.println("enter 2nd number");
	    int num2=scanner.nextInt();   
	    System.out.println("enter operator");
	    String op=scanner.next() ;
	    
	    switch(op) {
	    case "+":
	    	res=num1+num2;
	    	break;
	    case "-":
	    	res=num1-num2;
	    	break;
	    case "*":
	    	res=num1+num2;
	    	break;
	    case "/":
	    	res=num1/num2;
	    	break;
	    default:
	    	System.out.println("operator not found!");
	    }
	    System.out.println(res);
    
	}

}
