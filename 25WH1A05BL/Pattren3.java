package myproject5bl;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows=input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j= rows-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=rows-i;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
	}

}}
