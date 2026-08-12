package mypackage5an;

import java.util.Scanner;

public class PowerBill {
	public static void main(String[] args) {
		System.out.println("25WH1A05AN");
		Scanner input=new Scanner(System.in);//creating the scanner object to 
		//establish connection with the key board
		System.out.println("Enter the previous reading");
		int oldReading=input.nextInt();//converting the incoming data into int type
		System.out.println("The old reading is : "+oldReading);
		System.out.println("Enter present reading:");
		int presentReading=input.nextInt();
		System.out.println("The present reading is:"+presentReading);
		int difference=presentReading-oldReading;
		System.out.println("units: "+difference);
		double bill=0;
		if (difference>0 && difference<50) {
			bill=1*difference;
		}
		else if(difference<100) {
			bill=(1*50)+((difference-50)*2);
		}
		else if(difference<200) {
			bill=(1*50)+(2*50)+((difference-100)*3);
		}
		else if(difference<400) {
			bill=(1*50)+(2*50)+(3*100)+((difference-200)*4);
		}
		else {
			bill=(1*50)+(2*50)+(3*100)+(200*4)+((difference-400)*5);
		}
		System.out.println("Total bill is:"+bill);
	}
}