package mypackage5an;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("25WH1A05AN");
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner obj=new Scanner(System.in);
		int num1=obj.nextInt();
		int evensum=0;
		int oddsum=0;
		System.out.println("enter numbers");
		for(int m=0;m<num1;m++) {
			int num=obj.nextInt();
			if(num%2==0) {
				evensum+=num;
			}
			else {
				oddsum+=num;
			}
		}
		System.out.println("Sum of even integers = " + evensum);

        System.out.println("Sum of odd integers = " + oddsum);

	}

}
