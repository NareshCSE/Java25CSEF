package mypackage5cj;

import java.util.Scanner;

public class Pattern2 {

	public static void main(StringArray[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of rows:");
		Scanner input=new Scanner(System.in);
		int i,j,n,k;
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
