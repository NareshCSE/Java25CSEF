package mypackage5cj;

import java.util.Scanner;

public class Pattern4 {

	public static void main(StringArray[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of rows:");
		Scanner input=new Scanner(System.in);
		int i,j,n,k;
		n=input.nextInt();
		for(i=0;i<n;i++)
		{
			for(k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			char ch='A';
			for(j=0;j<n-i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	  }
	}
