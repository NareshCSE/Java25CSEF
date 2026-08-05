package mypackage0aa;

import java.util.Scanner; 

public class Oddeven{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        System.out.print("How many numbers do you want to enter? ");
        int totalNumbers = input.nextInt();
        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = input.nextInt();
            
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber; 
            } else {
                oddSum += currentNumber;  
            }
        }
        
       
        System.out.println("Final Results");
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}



