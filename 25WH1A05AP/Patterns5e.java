package mypackage5ap;

public class Patterns5e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	

	}

}
