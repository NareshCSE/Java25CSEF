package mypackage5aq;

public class Patterns5b {

	public Patterns5b() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=0;a<=5;a++) {
		for(int b=a;b<=5;b++) {
			System.out.print("  ");
		}
		for(int r=a;r>=0;r--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
