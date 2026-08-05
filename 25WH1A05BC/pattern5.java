package myproject5bc;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		
		System.out.println("enter no of rows:");
		
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();

		int i,j;

		for(i=1;i<=n;i++) {

			for(j=1;j<=i;j++) {

				System.out.print(j+" ");

			}

			System.out.println();

		}

		for(i=n-1;i>=1;i--) {

			for(j=1;j<=i;j++) {

				System.out.print(j+" ");

			}

			System.out.println();

		}

	}

}
