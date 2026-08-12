package mypackage5an;

public class patterns {

	public static void main(String[] args) {
		System.out.println("25WH1A05AN");
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int p=0;p<=5;p++) {
			for(int q=p;q<=5;q++) {
				System.out.print(" ");
			}
			for (int r = p; r >= 0; r--) // Safely counts down from p to 0
 {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
			System.out.println();
	}
}
