package mypackage;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=7;i>=1;i--) {

			for(int j=1;j<=7-i;j++) {

				System.out.print(" ");

			}

		for(char ch='A';ch<'A'+i;ch++){

					System.out.print(ch);

		}

		System.out.println();

		

		}
	}
}
