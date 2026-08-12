package myproject5bk;



import java.util.Scanner;



public class matrixmulti {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

		System.out.println("Enter rows and columns of matix1:");

		int r1=input.nextInt();

		int c1=input.nextInt();

		System.out.println("Enter the rows and columns of matix2:");

		int r2=input.nextInt();

		int c2=input.nextInt();

		if(c1!=r2) {

			System.out.println("Matix multipliaction is Not possible");

			return;

		}

		int[][] matrixA=new int[r1][c1];

		int[][] matrixB=new int[r2][c2];

		int[][] matrixC=new int[r1][c2];

		System.out.println("enter the elements in matrixA:");

		ReadElementsIntoMatrix(matrixA,r1,c1);

		System.out.println("enter the elements in matrixB:");

		ReadElementsIntoMatrix(matrixB,r2,c2);

			for(int i=0;i<r1;i++) {

				for(int j=0;j<c2;j++) {

					for(int k=0;k<c1;k++) {

						matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];

					}

				}

			}

			System.out.println("the matrix after multiplication is:");

			for(int i=0;i<r1;i++) {

				for(int j=0;j<c2;j++) {

					System.out.print(matrixC[i][j]+" ");

				}

				System.out.println();

			}

	}

	static void ReadElementsIntoMatrix(int[][] matrix,int r,int c){

		Scanner input=new Scanner(System.in);

		for(int i=0;i<r;i++) {

			for(int j=0;j<c;j++) {

				matrix[i][j]=input.nextInt();

			}

		}

	}

	}

	


