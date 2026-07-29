package mypackage5ch;
import java.util.Scanner;

public class Electricitybill {
	public static void main(String[] agrs) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter old reading and current reading:");
	int old_reading=sc.nextInt();
	int new_reading=sc.nextInt();
	System.out.println("old reading is "+old_reading+" new reading is "+new_reading);
	
	int units=new_reading-old_reading;
	int bill=0;
	System.out.println(units);
	if(units<50)
	{
		bill=50*1;
	}else if(units<100)
	{
		bill=50*1+(2*(50));
	}else if(units<200)
	{
		bill=(50*1)+(2*(50))+(3*(units-100));
	}else if(units<400)
	{
		bill=(50*1)+(2*(50))+(3*(100))+(4*(units-300));
	}else if(units>400)
	{
		bill=(50*1)+(2*(50))+(3*(100))+(4*(200))+5*(units-400);
	}
	System.out.print(bill);
	}
}
