package mypackage5cf;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			for(int j=0;j<7-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
		
			}
			System.out.println();
		}
		for(int i=0;i<=7;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
				
			}
			for(int k=7;k>=i;k--) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
}

