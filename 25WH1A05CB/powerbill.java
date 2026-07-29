package myproject5cb;

import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//creating the scanner
		                                    //establish the connection with keyboard
		System.out.println("enter the previous reading");
		int previousReading=input.nextInt(); //converting the incoming
		
		//similarly read present reading using scanner nextInt
		System.out.println("enter the present reading");
		int presentReading=input.nextInt(); //converting the incoming
		double bill=0;
		int units= presentReading-previousReading;
		if(units<50) {
			bill=50*1;
		}
		else if(units>=0&&units<=100) {
			bill=(50*1)+(units-50)*2;
		}
		else if(units>=100&&units<=200) {
			bill=(50*1)+(50*2)+(units-100)*3;
		}
		else if(units>=200&&units<=400) {
			bill=(50*1)+(50*2)+(100*3)+(units-200)*4;
			
		}
		else {
			bill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;
		}
		System.out.println(bill);
		
		
        

}
