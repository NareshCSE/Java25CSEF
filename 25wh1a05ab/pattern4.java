package mypackage5AB;

public class starpattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		           for (int i = 7; i >= 1; i--) {

		          
		            for (int j = 0; j < 7 - i; j++) {
		                System.out.print(" ");
		            }

		            
		            for (int j = 0; j < i; j++) {
		                System.out.print((char)('A' + j));
		            }

		            System.out.println();
		        }
		    }
		}
