package myproject5cb;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string:");
		String name=input.next();
		palindrome obj=new palindrome();
		boolean result=obj.ispalindrome(name);
		System.out.println(result);

	}
	boolean ispalindrome(String name) {
		boolean palindrome=false;
		for (int i=0;i<name.length()/2;i++) {
			if(name.charAt(i)==name.charAt(name.length()-i-1)) {
				palindrome=true;
			}
			
		}
		return palindrome;
		
	}

}
