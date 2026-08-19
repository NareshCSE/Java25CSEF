
package mypackage;
import java.util.Scanner;
public class Wpattern_2
{
	public static void main(String[]args)
	{
		int n;
		System.out.println("Enter no.of rows");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int i=0;
		while(i<n)
		{
			int k=i;
			while(k<n-1)
			{
				System.out.print(" ");
				k++;
			}
			int j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
