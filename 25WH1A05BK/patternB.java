package myproject5bk;

import java.util.Scanner;

public class patternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows-i;j>=0;j--) {
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
