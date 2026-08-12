package myproject5bk;

import java.util.Scanner;

public class patternE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=input.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");}
				System.out.println();
			}
		for(int i=row-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" " );
			}
			System.out.println();
		}
	}

}
