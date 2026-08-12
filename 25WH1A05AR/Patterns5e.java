package mypackage5ar;

public class Patterns5e {

	public static void main(String[] args) {
		int n = 7;
		
		//upper half
		for(int i = 1;i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				
			}
			System.out.println(	);
		}
		
		//lower half
		for(int i = n-1; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

