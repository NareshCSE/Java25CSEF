package mypackage5ap;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the number of integers: ");
		        int n = sc.nextInt();

		        int evenSum = 0;
		        int oddSum = 0;

		        System.out.println("Enter " + n + " integers:");

		        for (int i = 1; i <= n; i++) {
		            int num = sc.nextInt();

		            if (num % 2 == 0) {
		                evenSum += num;
		            } else {
		                oddSum += num;
		            }
		        }

		        System.out.println("Sum of even integers = " + evenSum);
		        System.out.println("Sum of odd integers = " + oddSum);

		        sc.close();
		
	}

}
