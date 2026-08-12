package welcome;

import java.util.Scanner;

public class Patterns4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 System.out.println("Patterns4");
	        for (int i = 1; i <= 7; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        for (int i = 6; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        
	    }
	}
