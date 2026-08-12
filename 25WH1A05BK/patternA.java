package myproject5bk;

import java.util.Scanner;

public class patternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number rows");
		int row=input.nextInt();
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}
		System.out.println();
	}}
	

}
