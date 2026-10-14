package mypackage5aw;
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers in Fibonacci series:");
        for (int num = 2; num <= n; num++) {
            boolean prime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                int a = 0, b = 1;
                while (a <= num) {
                    if (a == num) {
                        System.out.print(num + " ");
                        break;
                    }
                    int c = a + b;
                    a = b;
                    b = c;
                }
            }
        }
    }
}
