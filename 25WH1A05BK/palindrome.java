package myproject5bk;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string");
		String str=input.next();
		int l=str.length();
		int c=0;
		for(int i=0;i<l/2;i++) {
			if(str.charAt(i)!=str.charAt(l-i-1)) {
				System.out.println("string is not a palindrome");
				break;
			}
			c++;
		}
		if(c==l/2) {System.out.println("string is palindrome");
	}
	}
}
