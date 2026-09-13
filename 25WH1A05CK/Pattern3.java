package mypackage5ck;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        for (int i = 1; i <= 7; i++) {
		            for (int j = 1; j <= 7 - i; j++) {
		                System.out.print(" ");
		            }

		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }

		        for (int i = 6; i >= 1; i--) {
		            for (int j = 1; j <= 7 - i; j++) {
		                System.out.print(" ");
		            }

		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
		    }
		}

