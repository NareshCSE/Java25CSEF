
package myproject5bc;

import java.util.Scanner;

public class patter2 {



	public static void main(String[] args) {
		
		System.out.println("enter number of rows:");
		
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();

		for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*");

            }

            System.out.println( );

		        }

		    }

		}