package myproject5bd;
import java.util.Scanner;
public class Even{
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("enter integers");

		Scanner input=new Scanner(System.in);

		int n=input.nextInt();		
		System.out.println("enter" +n+ "integers:");
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<=n;i++) {
			int num=input.nextInt();
			if(num%2==0) {
				evensum+=num;

			}

			else {

				oddsum+=num;
			}
		}

		System.out.println("Even sum:"+evensum);

		System.out.println("Odd sum:"+oddsum);
	}
}






