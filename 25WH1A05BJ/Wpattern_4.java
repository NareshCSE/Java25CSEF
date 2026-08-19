package mypackage;
import java.util.Scanner;
public class Wpattern_4
{
	public static void main(String[]args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		n=in.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		int a=n-1;
		while(a>=1)
		{
			int j=1;
			while(j<=a)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			a--;
		}
	}
}

