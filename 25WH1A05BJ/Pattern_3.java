package mypackage;
import java.util.Scanner;
public class Pattern_3 
{
	public static void main(String[]args)
	{
		int i,j,k,n;
		System.out.println("Enter no.of rows");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			for(k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
