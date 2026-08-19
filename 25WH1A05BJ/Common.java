package mypackage;
import java.util.Scanner;
public class Common 
{
	public static void main(String[]args)
	{
		
		System.out.println("Enter no. of elements in first array");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("Enter no. of elements in array 2");
		int n2=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n2];
		System.out.println("Enter first array values");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter second array element");
		for(int i=0;i<n2;i++)
		{
			b[i]=in.nextInt();
		}
		System.out.println("Common elements are");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(a[i]==b[j])
					System.out.print(a[i]+" ");
			}
		}
	}
}
