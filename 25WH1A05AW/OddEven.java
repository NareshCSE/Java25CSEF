package mypackage5aw;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		

		        Scanner input = new Scanner(System.in);
		        
		        // Ask the user for the total count of numbers
		        System.out.print("How many integers do you want to enter? ");
		        int count = input.nextInt();
		        
		        int evenSum = 0;
		        int oddSum = 0; 
		        
		        System.out.println("Enter " + count + " integers:");
		        
		        // Use a for loop to read each integer and calculate sums
		        for (int i = 0; i < count; i++) {
		            int num = input.nextInt();
		            
		            if (num % 2 == 0) {
		                evenSum += num;
		            } 
		            else {
		                oddSum += num;
		            }
		        }
		        
		        // Print the final results
		        System.out.println("Sum of even integers: " + evenSum);
		        System.out.println("Sum of odd integers: " + oddSum);
		        
	}
		    }
		


