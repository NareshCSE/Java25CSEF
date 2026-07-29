package mypackage5at;

import java.util.Scanner;

public class ElecticityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //creating the scanner
		System.out.println("enter the old reading");
        int oldreading=input.nextInt();
        System.out.println("the old reading is:"+oldreading);
        System.out.println("enter current reading");
        int currentreading=input.nextInt();
        System.out.println("current reading is:"+currentreading);
        int units=currentreading-oldreading;
        System.out.println("number of units consumed is:"+units);
        if (0<units && units<=50)
        {
        	System.out.println("bill="+units*1);

        	}
        else if (50<units && units<=100)
        {
        	System.out.println("bill="+((50*1)+((units-50)*2)));	
        }
        
        else if (100<units && units<=200)
        {
        	System.out.println("bill="+((50*1)+(50*2)+((units-100)*3)));
        }
        else if(200<units && units<=400)
        {
        	System.out.println("bill="+((50*1)+(50*2)+(100*3)+((units-200)*4)));
        	
        }
        else
        {
        	System.out.println("bill="+((50*1)+(50*2)+(100*3)+(200*4)+((units-400)*5)));
        }
	}

}
