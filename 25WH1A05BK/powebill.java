package myproject5bk;

import java.util.Scanner;

public class powerbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//creating the scanner
											//establish the connection between keyboard
		System.out.println("enter the old reading");
		int oldReading=input.nextInt();	//converting the incoming
		System.out.println("the old reading is:"+oldReading);
		System.out.println("enter the current reading");
		int currentReading=input.nextInt();
		System.out.println("the currentreading is:"+currentReading);
		int units=currentReading-oldReading;
		System.out.println("units are:"+units);
		double bill=0;
		if(units<50) {
	    bill=units*1;
		}
		else if(units<100) {
			bill=(50*1)+(units-50)*2;
		}
		else if(units<200) {
			bill=(50*1)+(50*2)+((units-100)*3);
		}
		else if(units<400) {
			bill=(50*1)+(50*2)+(50*3)+((units-150)*4);
		}
		else {
			bill=(50*1)+(50*2)+(50*3)+(50*4)+((units-400)*5);
		}
		System.out.println("the total bill is:"+bill);
	}

}
