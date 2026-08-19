package mypackage5cd;
import java.util.Scanner;

public class Array_multiplication {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter no.of rows of array1:");

		int r1=input.nextInt();

		System.out.println("Enter no.of columnss of array1:");

		int c1=input.nextInt();
		
		System.out.println("Enter no.of rows of array2:");

		int r2=input.nextInt();

		System.out.println("Enter no.of columnss of array2:");

		int c2=input.nextInt();
		if(c1!=r2) {

			System.out.println("Matrix multiplication not possible, c2 is not equal to r1.");

		}
		else {

		int[][] array1=new int[r1][c1];

		System.out.println("Enter array1 elements:");

		for(int i=0;i<r1;i++) {

			for(int j=0;j<c1;j++){

			array1[i][j]=input.nextInt();

			}

		}


		int[][] array2=new int[r2][c2];

		System.out.println("Enter array2 elements:");

		for(int i=0;i<r2;i++) {

			for(int j=0;j<c2;j++){

			array2[i][j]=input.nextInt();

			}

		}


		System.out.println("Multiplied matrix is:");

		int[][] product_matrix=new int[r1][c2];

		for(int i=0;i<r1;i++) {

			for(int j=0;j<c2;j++) {

				for(int k=0;k<c1;k++) {

				 product_matrix[i][j]+=array1[i][k]*array2[k][j];

				}

				System.out.print(product_matrix[i][j]+" ");

			}

			System.out.println();

		}
		}
		
	}

}
