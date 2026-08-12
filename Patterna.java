package welcome;

import java.util.Scanner;

public class Patterna {

	public static void main(String[] args) {
	
				Scanner input=new Scanner(System.in);
				System.out.println("enter side value");
				int n=input.nextInt();
				int i,j,k;
				for(i=0;i<n;i++) {
					for(j=0;j<=i;j++) {
						System.out.print("* ");
					}
				
					System.out.println("\n");
				}
	}
}
