package mypackage5at;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of rows:");
		int rows=scanner.nextInt();
		for(int i=1;i<=rows;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
