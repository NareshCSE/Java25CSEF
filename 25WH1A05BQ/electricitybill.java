package mypackage5bq;

import java.util.Scanner;

public class powerbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);//creating the scanner
	    System.out.println("enter the old reading");
	    int oldReading=input.nextInt(); //converting the incoming
	    System.out.println("the old reading is: "+oldReading);
	    System.out.println("enter the present reading");
	    int presentReading=input.nextInt(); //converting the incoming
	    System.out.println("the present reading is: "+presentReading);
	    int total_units=presentReading-oldReading;
	    System.out.println("total units: "+total_units);
	    double bill=0;
	    if(total_units<50)
	    	bill=total_units*1;
	    else if(50<total_units&&total_units<=100)
	    	bill=(50*1)+((total_units-50)*2);
	    else if(100<total_units&&total_units<=200)
	    	bill=(50*1)+(50*2)+((total_units-100)*3);
	    else if(200<total_units&&total_units<=400)
	    	bill=(50*1)+(50*2)+(100*3)+((total_units-200)*4);
	    else
	    	bill=(50*1)+(50*2)+(100*3)+(200*4)+((total_units-400)*5);
	    System.out.println("electricity bill= "+bill);
	    
	  }

}
