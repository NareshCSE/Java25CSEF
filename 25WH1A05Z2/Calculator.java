package mypackage5z2;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);//scanner
		System.out.println("Enter the 1st number");
		double number1=scanner.nextDouble();
		System.out.println("Enter an operation: '+',' -',' *, /, %");
		char operator=scanner.next().charAt(0);
		System.out.println("Enter the 2nd number");
		double number2=scanner.nextDouble();
		double result;
		switch(operator) {
		case '+':
			result=number1+number2;
			System.out.println("result:"+number1+"+"+number2+"="+result);
			break;
		case '-':
			result=number1-number2;
			System.out.println("result:"+number1+"-"+number2+"="+result);
			break;
		case '*':
			result=number1*number2;
			System.out.println("result:"+number1+"*"+number2+"="+result);
		case '/':
			result=number1/number2;
			System.out.println("result:"+number1+"/"+number2+"="+result);
			break;
		case '%':
			result=number1%number2;
		    System.out.println("result:"+number1+"%"+number2+"="+result);
		    break;
		}
		}
	

}
