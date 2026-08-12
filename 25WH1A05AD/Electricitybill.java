package mypackage5ad;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        Scanner input=new Scanner(System.in);
        System.out.println("enter the previous reading");
        int old=input.nextInt();
        System.out.println("enter the present reading");
        int present=input.nextInt();
        System.out.println("the old reading is "+old);
        System.out.println("the new reading is "+present);
        int unitsconsumed=present-old;
        double bill=0;
       System.out.println("the no.of units consumed is "+unitsconsumed);
       if(unitsconsumed<50)
       {
    	   bill=unitsconsumed*1;
       }
       else if(unitsconsumed<100)
       {
    	   bill=(unitsconsumed-50)*2+50*1;
       }
       else if(unitsconsumed<200)
       {
    	   bill=(unitsconsumed-100)*3+50*2+50*1;
       }
       else if(unitsconsumed<400)
       {
    	   bill=(unitsconsumed-200)*4+50*3+50*2+50*1;
       }
       else
       {
    	   bill=(unitsconsumed-400)*5+50*4+50*3+50*2+50*1;
       }
        System.out.println("total bill="+bill);
	}
}


