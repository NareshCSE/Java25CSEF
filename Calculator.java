package mypackage;
import java.util.Scanner;
public class Calc 
{
	public static void main(String args[])
	{
	long num1,num2;
	int ch;
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the numbers");
	System.out.print("num1=");
	num1=in.nextLong();
	System.out.print("num2=");
	num2=in.nextLong();
	System.out.println("Which task to perform" );
	System.out.println("1.Addition");
	System.out.println("2.Difference");
	System.out.println("3.Multiplication");
	System.out.println("4.Quoteint");
	System.out.println("5.remainder");
	ch=in.nextInt();
	switch(ch)
	{
	case 1->System.out.println("Sum="+(num1+num2));
	case 2->System.out.println("Diffrence="+(num1-num2));
	case 3->System.out.println("Multiplication="+(num1*num2));
	case 4->System.out.println("Quoteint="+(num1/num2));
	case 5->System.out.println("Remainder="+(num1%num2));
	default->System.out.println("Invalid choice");
	
	}
	}
}
