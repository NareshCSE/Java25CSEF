package mypackage5z7;



import java.util.Scanner;



public class ElectricityBill {

	

	public static void main(String[] args) {

		//TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

		System.out.println("enter the previous reading");

		int old=input.nextInt();

		System.out.println("enter the present reading");

		int present=input.nextInt();

		System.out.println("the old reading is "+old);

		System.out.println("the new reading is "+present);

		int units=old-present;

		System.out.println("units are:"+units);

		double bill=0;

		if(units<=50) {

			bill=50*1;

		}

		else if(units>=51 && units<=100) {

			bill=(50*1)+(units-50)*2;

		}

		else if(units>=101 && units<=200) {

			bill=(50*1)+(50*2)+(units-100)*3;

		}

		else if(units>=201 && units<=400) {

			bill=(50*1)+(50*2)+(100*3)+(units-200)*4;

		}

		else { 

			bill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;

		}

		System.out.println("Total bill is:"+bill);

	}

}
