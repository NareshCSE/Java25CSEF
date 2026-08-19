package mypackage;
import java.util.Scanner;
public class Priefibo 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter thar range of prime no.");
		System.out.print("1 :");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		arr[0]=0;
		arr[1]=1;
		int i=2;
		while(arr[i-2]+arr[i-1]<=n)
		{
			arr[i]=arr[i-2]+arr[i-1];
			i++;
		}
		System.out.print("The prime no. are: ");
		for(int a=0;a<i;a++)
		{
			int count=0;
			for(int k=1;k<=arr[a];k++)
			{
				if(arr[a]%k==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(arr[a]+" ");
			}
		}

	}

}
