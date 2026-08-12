package myproject5bl;

import java.util.Scanner;

public class Pattern2 {

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
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
