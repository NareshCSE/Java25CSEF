package mypackage5at;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("The given String is a Palindrome.");
        } else {
            System.out.println("The given String is not a Palindrome.");
        }

        sc.close();

	}

}
