package mypackage5z7;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 obj1=new Array3();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter string");
		String word;
	    word=input.next();
		StringBuilder wordrev= new StringBuilder(word).reverse();
		System.out.println(wordrev);
        if(word.equals(wordrev.toString()))
        {
        	System.out.println("It is a Palindrome");
        }
        else
        {	System.out.println("It is not a palindrome");
	}
}
}
