package myproject;


import java.util.Scanner;
public class PowerBill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the old reading: ");
		int oldReading=input.nextInt();
		int bill;
		System.out.println("The old reading is: "+oldReading);
		System.out.println("Enter the current reading: ");
		int currentReading=input.nextInt();
		System.out.println("Enter the current reading: "+currentReading);
		int units = currentReading-oldReading;
		System.out.println("Total units: " +units);
		if(units<=50)
		{
			bill=units*1;
		}
		else if(50<units&&units<=100)
		{
			bill=(50*1)+(50*2)+((units-100)*3);
		}
		else if(200<units && units<=400)
		{
			bill=(50*1)+(50*2)+(100*3)+((units-200)*4);
		}
		else
		{
			bill=(50*1)+(50*2)+(100*3)+(200*4)+((units-400)*5);
		}
		System.out.println("Final bill amount: " +bill);
	}
}
