package mypackage5ap;

public class Patterns5c {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=0;x<=5;x++) {

			for(int y=0;y<=5-x;y++) {

				System.out.print(" ");

			}

			for(int z=0;z<=x;z++) {

				System.out.print("* ");

			}

			System.out.println();

		}

		for(int x=1;x<=5;x++) {

			for(int y=0;y<=x;y++) {

				System.out.print(" ");

			}

			for(int z=0;z<=5-x;z++) {

				System.out.print("* ");

			}

			System.out.println();

		}


	}

}
