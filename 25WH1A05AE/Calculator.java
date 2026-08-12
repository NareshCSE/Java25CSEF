package mypackage5ae;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//creating the scanner object to
		   									   //establish the connection with keybord
		System.out.println("Enter the number1:"); 
		int number1=input.nextInt();//converting the incoming


		System.out.println("Enter the number2:"); 
		int number2=input.nextInt();
		
		System.out.print("Enter operator (+, -, *, /): ");
        String operator = input.next();

        double result;

        // Perform calculation using switch-case
        switch (operator) {
            case "+":
                result = number1 + number2;
                System.out.println("Result = " + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println("Result = " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println("Result = " + result);
                break;

            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

	}

}
