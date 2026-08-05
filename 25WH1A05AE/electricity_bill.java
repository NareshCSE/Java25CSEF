package mypackage5ae;

import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//creating the scanner object to
											   //establish the connection with keybord
		System.out.println("Enter the old reading:"); 
		int oldReading=input.nextInt();//converting the incoming
		
		
		System.out.println("Enter the new reading:"); 
		int newReading=input.nextInt();//converting the incoming
		
		int totalUnits=newReading-oldReading;
		double bill=0;
			if(totalUnits<50) {
				bill=totalUnits*1;
			}else if(totalUnits<100) {
				bill=(50*1)+(totalUnits-50)*2;
			}else if(totalUnits<200) {
				bill=(50*1)+(50*2)+(totalUnits-100)*3;
			}else if(totalUnits<400){
				bill=(50*1)+(50*2)+(100*3)+(totalUnits-200)*4;
			}else if(totalUnits>400) {
				bill=(50*1)+(50*2)+(100*3)+(200*4)+(totalUnits-400)*5;
			}
		System.out.println("the old reading is : "+oldReading);
		System.out.println("the new reading is : "+newReading);
		System.out.println("Total Units is : "+totalUnits);
		System.out.println("Amount is : "+bill);


	}

}
