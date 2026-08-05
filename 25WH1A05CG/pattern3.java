package mypackage5cg;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		for(int i = 0;i < n ; i++) {
			for(int j= i ; j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
