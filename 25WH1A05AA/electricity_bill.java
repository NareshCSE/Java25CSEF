package mypackage0aa;

import java.util.Scanner;

public class electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in); //scanner object
		System.out.println("enter previous reading");
		int old=input.nextInt();
		System.out.println("old reading is "+old);
		System.out.println("enter current reading");
		int newreading=input.nextInt();
		System.out.println("present new reading is "+newreading);
		int units= newreading-old;
		System.out.println("final units consumed are "+units);
		//the bill
		float billAmount=0;
		 if (units <= 50) {
             billAmount = units * 1;
         } else if (units <= 100) {
             billAmount = (50 * 1) + ((units - 50) * 2);
         } else if (units <= 200) {
             billAmount = (50 * 1) + (50 * 2) + ((units - 100) * 3);
         } else if (units <= 400) {
             billAmount = (50 * 1) + (50 * 2) + (100 * 3) + ((units - 200) * 4);
         } else {
             billAmount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((units - 400) * 5);
         }

         // Print the final generated electricity bill
         System.out.println("Total Electricity Bill: Rs. " + billAmount);
     }

	}



