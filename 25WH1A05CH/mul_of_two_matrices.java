package mypackage5ch;

import java.util.Scanner;

public class addtion_of_two_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows in an array:");
		int n = sc.nextInt();
		System.out.println("Enter no.of columns in an array:");
		int m = sc.nextInt();
		
		int[][] ary = new int[n][m];
		System.out.print("Enter array elements");
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 ary[i][j] = sc.nextInt();
			 }
		 }
		 System.out.println("elements of array are:");
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
			   System.out.print(ary[i][j]+ " ");
			 }
			 System.out.println();
		 }
		 
			
			int[][] ary1 = new int[n][m];
			System.out.print("Enter array1 elements");
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<m;j++)
				 {
					 ary1[i][j] = sc.nextInt();
				 }
			 }
			 System.out.println("elements of array1 are:");
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<m;j++)
				 {
				   System.out.print(ary1[i][j]+ " ");
				 }
				 System.out.println();
			 }
			 
			 System.out.println("Sum of array:");
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<m;j++)
				 {
					 System.out.print(ary[i][j]+ary1[i][j]+" ");
				 }
				 System.out.println();
			 }
			 
			 System.out.println("Multiplication of two arrays: ");
			 int[][] result = new int[n][m];
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<m;j++)
				 {
					 for(int k=0;k<n;k++)
					 {
						 result[i][j]=(ary[i][k]*ary1[k][j])+result[i][j];
					 }
					 System.out.print(result[i][j]+" ");
				 }
				 System.out.println();
			 }
			 
	}

}
