package javaprograms;

import java.util.Scanner;

public class Primepalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers which are part of Fibonacci series:");

        for (int number = 2; number <= n; number++) {
            // Check whether number is prime
            boolean isPrime = true;
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Check whether number is in Fibonacci series
            boolean isFibonacci = false;
            int first = 0;
            int second = 1;

            while (first <= n) {
                if (first == number) {
                    isFibonacci = true;
                    break;
                }
                int next = first + second;
                first = second;
                second = next;
            }

            // Print if both prime and Fibonacci
            if (isPrime && isFibonacci) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }
}
