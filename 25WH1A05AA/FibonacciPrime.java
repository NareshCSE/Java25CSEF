package oopj_aa;

import java.util.Scanner;

public class FibonacciPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        System.out.print("Output: ");
        int a = 0, b = 1;
        while (a <= n) {
            if (a >= 2 && isPrime(a)) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
