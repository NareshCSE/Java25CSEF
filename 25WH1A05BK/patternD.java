package myproject5bk;

import java.util.Scanner;

public class patternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=input.nextInt();
		for(int i=row;i>=0;i--) {
			for(int j=0;j<=row-i;j++) {
				System.out.print(" ");	}
			for(char ch='A';ch<='A'+i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
