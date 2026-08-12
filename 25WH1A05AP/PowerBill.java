package mypackage5ap;

import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//creating the scanner object to establish the connection with keyboard

		System.out.println("Enter the previous reading:");
		int oldReading=input.nextInt();//converting the incoming data into integer
		System.out.println("The old reading is:"+oldReading);
		System.out.println("Enter the present reading:");
		int presentReading=input.nextInt();
		System.out.println("The present reading is:"+presentReading);
		int units=presentReading-oldReading;
		System.out.println("Total no.of Units:"+units);
		double bill=0;
		if(units>0&&units<50) {
			bill=units*1;
		}else if(units<100) {
			bill=(50*1)+((units-50)*2);
		}else if(units<200) {
			bill=(50*1)+(50*2)+((units-100)*3);
		}else if(units<=400) {
			bill=(50*1)+(50*2)+(100*3)+((units-200)*4);
		}else if(units>400) {
			bill=(50*1)+(50*2)+(100*3)+(200*4)+((units-400)*5);
		}
		System.out.println("Powerbill="+bill);

	}

}
