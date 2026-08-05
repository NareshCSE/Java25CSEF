package mypackage5cg;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int ispalindrome=0;
        for(int i = 0; i < n/2 ; i++)
        {
        	if(str.charAt(i)!= str.charAt(n-i-1) ) {
        		ispalindrome=1;
        		
        	}
        }
        if(ispalindrome==0)
        {
        	System.out.println("string is palindrome");
        }
        else
        {
        	System.out.println("string is not palindrome");
        }
	}

}
