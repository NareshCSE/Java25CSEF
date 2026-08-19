package mypackage5cf;

import java.util.Scanner;

public class sumofeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int evensum=0;
		int oddsum=0;
		System.out.println("enter no of integers");
		int totalnumbers=input.nextInt();
		System.out.println("enter "+ totalnumbers+ "integers");
		for(int i=0;i<totalnumbers;i++) {
			int currentnum=input.nextInt();
			if(currentnum%2==0) {
				evensum+=currentnum;
	       }
			else {
				oddsum+=currentnum;
			}
		}
		System.out.println("sum of even integrs:"+evensum);
		System.out.println("sum of odd integers:"+oddsum);
	}

}
