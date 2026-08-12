package mypackage5cj;

import java.util.Scanner;

public class SetofIntegers {

	public static void main(StringArray[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of integers:");
		int n=input.nextInt();
		System.out.println("Enter the set of integers:");
		int i,b=0,c=0;
		int a[]=new int[5];
		for(i=0;i<n;i++)
		{
		     a[i]=input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				b+=a[i];
			}
			else
			{
				c+=a[i];
			}
		}
		System.out.println("The sum of even number is:"+b);
		System.out.println("The sum of odd number is:"+c);
	}
}
