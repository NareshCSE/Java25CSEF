package mypackage5be;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		int[][] c=new int[2][2];
		System.out.println("Enter 1st array elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=input.nextInt();
				
			}
		}
			System.out.println("Enter 2nd array elements");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					b[i][j]=input.nextInt();
				}
			}
				for(int i=0;i<2;i++) {
					for(int j=0;j<2;j++) {
						int sum=0;
						for(int k=0;k<2;k++) {
							sum=sum+a[i][k]*b[k][j];
						}
						c[i][j]=sum;
					}
				}
				System.out.println("Enter result:");
				for(int i=0;i<2;i++) {
					for(int j=0;j<2;j++) {
						System.out.println(c[i][j]+" ");
					}
				}
	}
}
				
						
			
		

	


