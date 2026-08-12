package mypackage5ch;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch=65;
		
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print((char) (65+j));
			}
			
			System.out.println();
		}
	}

}
