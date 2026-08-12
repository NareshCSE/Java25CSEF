package mypackage5an;

public class Patterns3 {

	public static void main(String[] args) {
		System.out.println("25WH1A05AN");
		// TODO Auto-generated method stub
            int n = 7;



            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {

                    System.out.print("  ");

                }

                for (char ch = 'A'; ch < 'A' + (n - i); ch++) {

                    System.out.print(ch + " ");

                }



                System.out.println();
            }
	}
}
