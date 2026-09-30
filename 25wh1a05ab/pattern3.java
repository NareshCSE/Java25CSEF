package mypackage5AB;

public class starpattern3 {

	public static void main(String[] args) {
		        for (int i = 1; i <= 7; i++) {

		            for (int s = 1; s <= 7 - i; s++)
		                System.out.print(" ");

		            for (int j = 1; j <= i; j++)
		                System.out.print("* ");

		            System.out.println();
		        }
		        for (int i = 6; i >= 1; i--) {

		            for (int s = 1; s <= 7 - i; s++)
		                System.out.print(" ");

		            for (int j = 1; j <= i; j++)
		                System.out.print("* ");

		            System.out.println();
		        }
		    }
		}
