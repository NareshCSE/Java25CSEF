package myproject5bd;

public class Patternd {
	public static void main(String[] args) {
		for(int i=7;i>=1;i--) {
			for(int j=1;j<=7-i;j++) {
				System.out.print(" ");
			}
		for(char ch='A';ch<'A'+i;ch++) {
			System.out.print(ch);
		}
		System.out.println();
		}
	}
}
