package mypackage5z7;

import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //creating the scanner object to 
		                                   //establish the connection with keyboard
		System.out.println("enter the previous reading");
		int old=input.nextInt();  //converting the incoming
		
		//similarly read present reading using scanner nextInt
		System.out.println("enter the present reading");
		int present=input.nextInt();  //converting the incoming
		
		System.out.println("the old reading is:"+old);
		System.out.println("the new reading is:"+present);
		
		int total_units = present - old;
		System.out.println("the total_units is:"+total_units);
		
		
		
		
	}

}
