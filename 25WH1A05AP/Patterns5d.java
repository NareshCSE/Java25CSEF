package mypackage5ap;

public class Patterns5d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 7;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");   // two spaces
            }

            // Print alphabets
            for (char ch = 'A'; ch < 'A' + (n - i); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

		
	}

}


