package mypackage;
import java.util.Scanner;
public class Duplicates 
{
	public static void main(String[]args)
	{
		int i,j;
		System.out.println("Enter no. of array elements");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			System.out.print("a["+(i)+"]=");
			a[i]=in.nextInt();
			System.out.println();
		}
		System.out.println("The duplicate elements are");
		
		for(i=0;i<n;i++)
		{
			int count=0;
			for(j=i;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
				if(count>1)
			
				System.out.print(a[i]+" ");
			
		}
	
	}
}
