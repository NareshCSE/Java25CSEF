package mypackage5cd;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); //creating the scanner objective
		System.out.println("Enter the previous readings:");
		int oldReading=input.nextInt(); //converting the incoming
		System.out.println("The old reading is: "+oldReading);
		System.out.println("Enter the new readings:");
		int newReading=input.nextInt();
		System.out.println("The new reading is: "+newReading);
		int units=newReading-oldReading;
		System.out.println("The units are: "+units);
		int bill;
		
		if(units<50) 
		{
			bill=units*1;
		}
		else if(units>50 && units<=100)
		{
			bill=(50*1)+((units-50)*2);
		}
		else if(units>100 && units<=200)
		{
			bill=(50*1)+(50*2)+(units-100)*3;
		}
		else if(units>200 && units<=400)
		{
			bill=(50*1)+(50*2)+(100*3)+(units-200)*4;
		}
		else
		{
			bill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;
		}
		System.out.println("Bill is "+bill);
			
		// TODO Auto-generated method stub

	}

}
