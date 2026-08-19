package mypackage;
import java.util.Scanner;
public class Pattern_4 
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter no.of rows");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int k=i;k<n-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
