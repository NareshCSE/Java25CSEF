package mypackage5be;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of integers:");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " integers:");
        int evensum = 0;
        int oddsum = 0;
        
        // Changed i <= n to i < n so it loops exactly n times
        for(int i = 0; i < n; i++) { 
            int num = sc.nextInt();
            if(num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
        }
        
        System.out.println("Even sum: " + evensum);
        System.out.println("Odd sum: " + oddsum);
        
        sc.close();
	}
}
