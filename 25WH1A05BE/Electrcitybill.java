package mypackage5be;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //Creating a scanner object to establish the connection with keyboard
		System.out.println("Enter the previous reading");
		int oldReading=input.nextInt(); //converting the incoming
		
		System.out.println("The previous reading is:"+oldReading);
		System.out.println("Enter the new reading");
		int newReading=input.nextInt();
		System.out.println("The new reading is:"+newReading);
		int total=newReading-oldReading;
		System.out.println("The total units:"+total);
		
		double bill=0;
		if(total==50) {
			bill=50*1;

		}else if(total>50 && total<100) {
			bill=(50*1)+(total-50)*2;
		}else if(total>100 && total<200) {
	        bill=(50*1)+(50*2)+(total-100)*3;
		}else if(total>200 && total<400) {
	    	bill=(50*1)+(50*2)+(50*3)+(total-200)*4;
	    }else
	    {
	    	bill=(50*1)+(50*2)+(50*3)+(50*4)+(total-400)*5;
	    }
		System.out.println("The total bill is:"+bill);
		

	
	}
}

