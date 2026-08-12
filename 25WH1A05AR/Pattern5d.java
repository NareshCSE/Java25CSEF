package mypackage5ar;

public class Patterns5d {

	public static void main(String[] args) {
		
		int n = 7;
		
		for(int i = n; i >= 1; i--) {
			
			//print leading spaces
			for(int j = 0; j < n - i; j++) {
				System.out.print("  "); 
			}
			
			//print alphabets
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch + " ");
			}
			
			System.out.println();
		}
	}
}
