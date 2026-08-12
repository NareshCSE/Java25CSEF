package mypackage5cj;

import java.util.Scanner;

public class PowerBill {

	public static void main(StringArray[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the old reading");
		int oldreading=input.nextInt();
		System.out.println("The old reading is "+oldreading);
		System.out.println("Enter the current reading");
		int currentreading=input.nextInt();
		System.out.println("The new reading is "+currentreading);
		int units=currentreading-oldreading;
		System.out.println("The unit consumed is "+units);
		int bill=0;
		if(units<=50)
		{
			bill=units*1;
		}
		else if(units<=100)
		{
			bill=50+(units-50)*2;
		}
		else if(units<=200)
		{
			bill=50+100+(units-100)*3;
		}
		else if(units<=400)
		{
			bill=50+100+200+(units-200)*4;
		}
		else
		{
			bill=50+100+200+300+(units-300)*5;
		}
		System.out.println("The bill is "+bill);

	}

}
