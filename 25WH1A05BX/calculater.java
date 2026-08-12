package myproject5bx;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        
        System.out.print("Enter an operator");
        char operator = scanner.next().charAt(0);
        
        double result;
        boolean isValid = true;

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero error
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    isValid = false;
                    result = 0;
                } 
                else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                isValid = false;
                result = 0;
                break;
        }

        // Display the output if the operation was valid
        if (isValid) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        // Close the scanner resource
        scanner.close();
    }
}
 