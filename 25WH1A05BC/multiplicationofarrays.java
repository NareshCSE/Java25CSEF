package myproject5bc;

import java.util.Scanner;

public class multiplicationofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);

		int[][] arr1=new int[2][2];

		int[][] arr2=new int[2][2];

		int[][] product=new int[2][2];

		System.out.println("enter first array values:");

		for(int i=0;i<2;i++) {

			for(int j=0;j<2;j++) {

				arr1[i][j]=input.nextInt();

			}

		}

		System.out.println("enter second array values:");

		for(int i=0;i<2;i++) {

			for(int j=0;j<2;j++) {

				arr2[i][j]=input.nextInt();

			}

		}

		for(int i=0;i<2;i++) {

			for(int j=0;j<2;j++) {

				int sum=0;

				for(int k=0;k<2;k++) {

					sum=sum+arr1[i][k]*arr2[k][j];

					}

				product[i][j]=sum;	

			}

		}

		System.out.println("result matrix:");

		for(int i=0;i<2;i++) {

			for(int j=0;j<2;j++) {

				System.out.println(product[i][j]+" ");	

			}

			System.out.println();

		}

	}



}

		
		
