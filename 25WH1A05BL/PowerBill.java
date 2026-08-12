package myproject5bl;

import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//creating the scanner to establish with the keyboard
		System.out.println("enter the previous readinds");
		int oldReading=input.nextInt();//converting the incoming
		System.out.println("the old reading is:"+oldReading);
		System.out.println("enter the current reading");
		int currentReading=input.nextInt();
		System.out.println("the current reading is:"+currentReading);
		int units=currentReading-oldReading;
		System.out.println("the no of units are:"+units);
		double bill=0;
		if(units<50) {
			bill=units*1;
		}
		else if(units<100) {
			bill=50+(units-50)*2;
		}
		else if(units<200) {
			bill=50+(50*2)+((units-100)*3);
		}
		else if(units<400) {
			int t=units-50;
			int t1=t-50;
			int t2=t1-100;
			bill=50+(50*2)+(100*3)+(t2*4);
		}
		else {
			int t=units-50;
			int t1=t-50;
			int t2=t1-100;
			int t3=t2-200;
			bill=50+(50*2)+(100*3)+(200*4)+(t3*5);
		}
		System.out.println("the bill is:"+bill);
		
		

	}

}
