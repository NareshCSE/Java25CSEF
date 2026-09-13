package mypackage5ck;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        String reverse = "";

		        for (int i = str.length() - 1; i >= 0; i--) {
		            reverse = reverse + str.charAt(i);
		        }

		        if (str.equals(reverse)) {
		            System.out.println("Palindrome");
		        } else {
		            System.out.println("Not Palindrome");
		        }
		    }
		}
