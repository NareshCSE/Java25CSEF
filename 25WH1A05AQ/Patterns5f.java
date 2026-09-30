package mypackage5aq;

public class Patterns5f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;

        for (int i = n; i >= 1; i--) {

            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            // Print alphabets
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
