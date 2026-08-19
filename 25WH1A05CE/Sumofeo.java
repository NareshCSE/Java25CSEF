package mypackage5ce;

import java.util.Scanner;

public class Sumofeo {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
	
		 Scanner input=new Scanner(System.in);
		int evenSum=0;
		int oddSum=0;
        System.out.println("enter no.of integers");
        int totalnumbers=input.nextInt();
        System.out.println("Enter "+totalnumbers+" integers:");
        for(int i=0;i<totalnumbers;i++) {
        	int currentNum=input.nextInt();
        	if(currentNum%2==0) {
        		evenSum+=currentNum;
        	}
        	else {
        		oddSum+=currentNum;
        	}
        }
        System.out.println("sum of even integers:"+evenSum);
        System.out.println("sum of odd integers;" +oddSum);
         
        
        
	
	}
}