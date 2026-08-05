package myproject5bc;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		System.out.println("enter the no of rows");

		int rows=input.nextInt();

		for(int i=rows;i>=0;i--) {

			for(int j=0;j<rows-i;j++) {

				System.out.print(" ");

			}

			for(char k='A';k<='A'+i;k++) {

				System.out.print(k);

			}

			System.out.println();

		}
	}

}
