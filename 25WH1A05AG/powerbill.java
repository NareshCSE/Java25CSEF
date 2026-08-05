package mypackage5ag;

import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
		System.out.println("enter the old reading");
		int oldReading=input1.nextInt();
		System.out.println("the old reading is:"+oldReading);
		Scanner input2=new Scanner(System.in);
		System.out.println("enter present reading");
		int presentReading=input2.nextInt();
		System.out.println("present reading:"+presentReading);
		int result=presentReading-oldReading;
		int bill;
		System.out.println("no.of units consumed:"+result);
		if(result>0 & result<=50) {
			bill=result*1;
		}
		else if (result>50 & result<=100) {
			bill=50*1+(result-50)*2;
		}
		else if(result>100 & result<=200) {
			bill=50*1+50*2+(result-100)*3;}
		else if(result>200 & result<=400) {
			bill=50*1+50*2+100*3+(result-200)*4;}
		else {
			bill=50*1+50*2+100*3+200*4+(result-400*5);}
		System.out.println("electricity bill:"+bill);
		
		}
}

