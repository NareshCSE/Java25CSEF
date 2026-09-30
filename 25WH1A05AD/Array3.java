package mypackage5ad;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 obj1=new Array3();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no.of elements in array 1");
		int n=input.nextInt();
		System.out.println("Enter no.of elements in array 2");
		int m=input.nextInt();
		String[] arr=new String[n];
		String[] arr2=new String[m];
		System.out.println("Enter elements of array 1");
		for(int i=0;i<n;i++)
		{
		 arr[i] =input.next();
		}
		System.out.println("Enter elements of array 2");
		for(int i=0;i<m;i++)
		{
		 arr2[i] =input.next();
		}
		System.out.println("Common values:");
		for(int i=0;i<n;i++)
		{
			String inst=arr[i];
			for(int j=0;j<m;j++)
			{
				if(arr2[j].equals(inst))
				{	System.out.println(inst);
				}
			}
			}

	}

}
