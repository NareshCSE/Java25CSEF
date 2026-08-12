package mypackage;
import java.util.Scanner;
public class Evenandodd {

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int n, num;
	        int evenSum = 0, oddSum = 0;

	        System.out.print("Enter the number of integers: ");
	        n = input.nextInt();

	        System.out.println("Enter " + n + " integers:");

	        for (int i = 0; i < n; i++) {
	            num = input.nextInt();

	            if (num % 2 == 0) {
	                evenSum += num;
	            } else {
	                oddSum += num;
	            }
	        }

	        System.out.println("Sum of even integers = " + evenSum);
	        System.out.println("Sum of odd integers = " + oddSum);

	        
	    }
	
		
		

	}


