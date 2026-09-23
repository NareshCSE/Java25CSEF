package mypackage5at;

import java.util.Scanner;

public class Loop5e {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of rows:");
		int rows=scanner.nextInt();
		for(int i=1;i<=rows;i++) {
			int num=1;
			for (int j=1;j<=i;j++) {
				System.out.print(num );
				num++;
			}
			System.out.println();
		}
		for (int i=rows-1;i>=1;i--) {
			int num =1;
			for (int j=1;j<=i;j++) {
				System.out.print(num);
				num++;
				
			}
			System.out.println();
		}

	}

}
