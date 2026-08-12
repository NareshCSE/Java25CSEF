package mypackage5ae;

import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i;int n;int sum1=0;int sum2=0;
		System.out.println("Enter number of element in an array");
		n=input.nextInt();
		System.out.println("Enter elements of array:");
		for(i=1;i<=n;i++)
		{
			
			i=input.nextInt();
			if (i%2==0) 
			  {
				sum1=sum1+i;
			  }
			else 
			{
				sum2=sum2+i;
			}
		}
		System.out.println("Sum of even numbers:"+sum1);
		System.out.println("Sumof odd numbers:"+sum2);
	}
}
