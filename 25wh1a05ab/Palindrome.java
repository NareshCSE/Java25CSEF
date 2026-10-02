package javaprograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String string = scanner.nextLine();

        String reverse = "";
        for (int index = string.length() - 1; index >= 0; index--) {
            reverse = reverse + string.charAt(index);
        }

        if (string.equals(reverse)) {
            System.out.println("The given String is a Palindrome.");
        } else {
            System.out.println("The given String is not a Palindrome.");
        }

        scanner.close();
    }
}
