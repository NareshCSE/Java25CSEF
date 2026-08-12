package mypackage5z3;

import java.util.Scanner;

public class ElectricityBill {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

		System.out.println("enter old reading:");

		int oldReading=input.nextInt();

		System.out.println("old reading is:"+oldReading);

		System.out.println("enter current reading");

		int currentReading=input.nextInt();

		System.out.println("current reading is:"+currentReading);

		int units=oldReading-currentReading;

		System.out.println("Units are:"+units);

		double bill=0;

		if(units<50) {

			bill=50*1;

		}

		else if(units<100) {

			bill=(50*1)+(units-50)*2;

		}

		else if(units<200) {

			bill=(50*1)+(50*2)+(units-100)*3;

		}

		else if(units<400) {

			bill=(50*1)+(50*2)+(100*3)+(units-200)*4;

		}

		else {

			bill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;

		}

		System.out.println("Total bill is:"+bill);

	}

		

			

		

		

		



}
