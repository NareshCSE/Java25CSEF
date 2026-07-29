package myproject5bc;

import java.util.Scanner;

public class powerbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);   //creating the scanner object to
		                                        //establish the connection with keyboard
		System.out.println("enter the old reading");
		int oldReading=input.nextInt();         
		
		System.out.println("the old reading is:"+oldReading);
		
		Scanner input1=new Scanner(System.in);
		System.out.println("enter new reading");
		int newReading=input1.nextInt();
		
		System.out.println("the new reading is:"+newReading);
		
		int totalunits=newReading-oldReading;
		System.out.println("total units:"+totalunits);
		double bill=0;
		if(totalunits<50) {
			bill=totalunits*1;
		}
		else if(totalunits<100)
		{
			bill=(50*1)+((totalunits-50)*2);
		}
		else if(totalunits<200)
		{
			bill=(50*1)+(50*2)+((totalunits-100)*3);
		}
		else if(totalunits<400)
		{
			bill=(50*1)+(50*2)+(50*3)+((totalunits-200)*4);
		}
		else
		{
			bill=(50*1)+(50*2)+(50*3)+(50*4)+((totalunits-400)*5);
		}
			
		System.out.println(bill);

	}

}

