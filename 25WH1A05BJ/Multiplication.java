package mypackage;
import java.util.Scanner;
public class Multiplication 
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no. of rows in array1");
		int r=in.nextInt();
		System.out.println("Enter no. of columns in array1");
		int c=in.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter first array elements row wise");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter no. of rows in array2");
		int r1=in.nextInt();
		System.out.println("Enter no. of columns in array1");
		int c1=in.nextInt();
		int b[][]=new int[r1][c1];
		System.out.println("Enter second array elements row wise");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				b[i][j]=in.nextInt();
			}
		}
		
		if(c!=r1)
		{
			System.out.println("Multiplication not possible");
		}
		else
		{
			int d[][]=new int[r][c1];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c1;j++)
				{
					for(int k=0;k<c;k++)
					{
						d[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("Product of two arrays are");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(d[i][j]+" ");
				}
				System.out.println();
			}
		}
			
	}
}
