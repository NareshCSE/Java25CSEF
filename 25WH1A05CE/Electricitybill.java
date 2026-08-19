package mypackage5ce;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//creating the scanner object
		System.out.println("Enter the old reading");//establish the connection with keyboard
		int oldreading=input.nextInt();//converting the incoming
		System.out.println("The oldreading is "+oldreading);
		
		System.out.println("Enter the present reading");
		int presentreading=input.nextInt();
		System.out.println("The present reading is"+presentreading);
		
		int units=presentreading-oldreading;
		System.out.println(units);
		double bill=0;
		if(units<=50) {
			bill=units*1;
		}
		else if(units>50&&units<=100) {
			bill=(50*1)+((units-50)*2);
			}
		else if(units>100&&units<=200) {
			bill=(50*1)+(50*2)+((units-100)*3);
		}
		else if(units>200&&units<=400) {
			bill=(50*1)+(50*2)+(100*3)+((units-200)*4);
		}
		else {
			bill=(50*1)+(50*2)+(100*3)+(200*4)+((units-400)*5);
			
		}
		System.out.println(bill);

	}
}
