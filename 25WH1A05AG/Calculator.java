package mypackage5ag;
import java.util.Scanner;

public class Calculater {
	public static void main(String[] args) {
		//ToDo Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int number1=scan.nextInt();
		System.out.println("enter second element");
		int number2=scan.nextInt();
		System.out.println("choose operator to perform\n 1.+(add)\n2.-(subtract)\n3.*(multiplication)\n4./(divide)");
		int exp=scan.next().charAt(0);
		switch(exp) {
		case '+':System.out.println("Addition:"+(number1+number2));
		break;
		case '-':System.out.println("substraction:"+(number1-number2));
		break;
		case '*':System.out.println("multiplication:"+(number1*number2));
		break;
		case '/':System.out.println("division:"+(number1/number2));
		break;
		default:System.out.println("invalid option");
		break;
		}
		
	}
	
	

}
