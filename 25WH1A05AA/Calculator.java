package mypackage0aa;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        double result = 0;

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
                result = num1 / num2;
                break;
        }

        System.out.println("Result: " + result);
        
    }
}
