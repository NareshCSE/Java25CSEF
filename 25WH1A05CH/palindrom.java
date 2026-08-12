package mypackage5ch;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		String str = sc.next();
		int ispalindrome=0;
		int n = str.length();
		for(int i=0; i<n/2; i++)
		{
			if(str.charAt(i) != str.charAt(n-i-1))
			{
				 ispalindrome=1;
			}
		}
		if(ispalindrome==1)
		{
			System.out.println("String is not palindrome");
		}
		else {
			System.out.println("String is palindrome");
		}
	}

}
