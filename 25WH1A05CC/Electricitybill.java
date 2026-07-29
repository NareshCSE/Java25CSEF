package mypackage5cc;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the old readings:");
		int oldreading=input.nextInt();
		System.out.println("the old reading is "+oldreading);
		System.out.println("enter the new reading ");
		int newreading=input.nextInt();
		System.out.println("the new reading is "+newreading);
		int units=newreading-oldreading;
		System.out.println("The present units is :"+units);
		int bill;
		if(units<50)
		{
			bill=units*1;
		}
		else if(units>50&&units<=100)
		{
			bill=50*1+(units-50)*2;
		}
		else if(units>100&&units<=200)
		{
			bill=50*1+50*2+(units-100)*3;
		}
		else if(units>200&&units<=400)
		{
			bill=50*1+50*2+100*3+(units-200)*4;
		}
		else
		{
			bill=50*1+50*2+100*3+200*4+(units-400)*5;
		}
		System.out.println("the bill is : "+bill);
		
		
	}
}
