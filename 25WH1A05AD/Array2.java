package mypackage5ad;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 obj1=new Array2();
		Scanner input=new Scanner(System.in);
		int[][] arr=new int[3][3];
		int[][] arr2=new int[3][3];

		System.out.println("Enter elements");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] =input.nextInt();
			}
		}

		for(int k=0;k<3;k++)
		{
			for(int l=0;l<3;l++)
			{
				arr2[k][l] =input.nextInt();
			}
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			}
		}
	}
}
