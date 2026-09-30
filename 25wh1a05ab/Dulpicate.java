package javaprograms;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter array elements:");

        for (int index = 0; index < n; index++) {
            numbers[index] = scanner.nextInt();
        }

        System.out.println("Duplicate values:");
        for (int index = 0; index < n; index++) {
            for (int nextIndex = index + 1; nextIndex < n; nextIndex++) {
                if (numbers[index] == numbers[nextIndex]) {
                    System.out.println(numbers[index]);
                    break; // avoids printing same duplicate multiple times
                }
            }
        }

        scanner.close();
    }
}
