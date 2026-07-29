package pattern.java;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number of lines of the pattern");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
				
			}
		
		
	
	//pattern 2
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(" *");
		}
		System.out.println();
	    }
	}
}
     

    
	


