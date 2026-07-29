package myproject5bh;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the old reading");
		int oldReading=input.nextInt();
		System.out.println("the old reading is:"+oldReading);
		System.out.println("enter the current reading");
		int currentReading=input.nextInt();
		System.out.println("the current reading is:"+currentReading);
		int totalUnits=currentReading-oldReading;
		System.out.println("the total number of units consumed is:"+totalUnits);
		double bill=0;
		if(totalUnits<50) {
			bill=50*1;
		}else if(totalUnits<100) {
			bill=(50*1)+(totalUnits-50)*2;
		}else if(totalUnits<200) {
			bill=(50*1)+(50*2)+(totalUnits-100)*3;
		}else if(totalUnits<400) {
			bill=(50*1)+(50*2)+(50*3)+(totalUnits-150)*4;
		}else {
			bill=(50*1)+(50*2)+(50*3)+(50*4)+(totalUnits-200)*5;
		}
		System.out.println("the total bill is:"+bill);
			
			
			
		}

	}


