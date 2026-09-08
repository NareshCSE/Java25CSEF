package myproject;

import java.util.Scanner;

public class Matrix {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int[][] a = new int[2][2];
	        int[][] b = new int[2][2];
	        int[][] c = new int[2][2];

	        System.out.println("Enter first matrix:");
	        for(int i=0;i<2;i++)
	            for(int j=0;j<2;j++)
	                a[i][j] = input.nextInt();

	        System.out.println("Enter second matrix:");
	        for(int i=0;i<2;i++)
	            for(int j=0;j<2;j++)
	                b[i][j] = input.nextInt();

	        for(int i=0;i<2;i++)
	            for(int j=0;j<2;j++)
	                for(int k=0;k<2;k++)
	                    c[i][j] += a[i][k] * b[k][j];

	        System.out.println("Result:");
	        for(int i=0;i<2;i++) {
	            for(int j=0;j<2;j++)
	                System.out.print(c[i][j] + " ");
	            System.out.println();
	        }
	    }

	    }
