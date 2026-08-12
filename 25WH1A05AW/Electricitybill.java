package mypackage5aw;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage mypackage;



		//creating the scanner

		Scanner input=new Scanner(System.in); 



		//established the connection with the keyboard

		System.out.println("Enter the old reading");



		//converting the incoming

		int oldReading=input.nextInt();

		System.out.println("The old reading is: "+oldReading);

		System.out.println("Enter the new reading");

	    int newReading=input.nextInt();

	    System.out.println("The new reading is: "+newReading);

	    int total=newReading-oldReading;

	    System.out.println("The total reading is: "+total);

	    double bill;

	    if(total<50) {

	    	bill=total*1;

	    }else if(total<100) {

	    	bill=(50*1)+((total-50)*2);

	    }else if(total<200) {

	    	bill=(50*1)+(50*2)+((total-100)*3);

	    }else if(total<400) {

	    	bill=(50*1)+(50*2)+(100*3)+((total-200)*4);

	    }else {

	    	bill=(50*1)+(50*2)+(100*3)+(200*4)+((total-400)*5);

	    }

		



	}

}
