package myproject5cb;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter number of lines of pattern");
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
			   System.out.print("*");
			
		}
		System.out.println();

	}

	}
}
	
