package mypackage5cj;

import java.util.Scanner;

public class Pattern3 {

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
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=n-1;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=n-i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
