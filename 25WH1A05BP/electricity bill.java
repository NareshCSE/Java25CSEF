package mypackage5bp;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //creating the scanner 
		
		System.out.println("enter the previous reading");
		int previousReading=input.nextInt(); //converting the incoming 
		
		System.out.println("the previous reading is:"+previousReading);
		
		//similarly read present reading using scanner nextInt
		System.out.println("enter the previous reading");
		int presentReading=input.nextInt();// converting the incoming 
		
		int units=presentReading - previousReading;
		System.out.println("Total units;"+units);
		double bill=0;
		if(units <= 50)
		{
			bill=units*1;
		}
			else if(50<units&&units<=100)
			{
				bill=(50*1)+((units-50)*2);
			}
			else if(100<units&&units<=200)
			{
				bill=(50*1)+(50*2)+((units-100)*3);
			}
			else if(200<units&&units<=400)
			{
				bill=(50*1)+(50*2)+(100*3)+((units-200)*4);
			}
			else 
			{
				bill=(50*1)+(50*2)+(100*3)+(200*4)+((units-400)*5);
			}
			System.out.println("Final bill Amount"+ bill);
		}
	}
	
