package myproject5z4;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=8;i++) {
			for(j=1;j<=i-1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=1;i<=8;i++) {
			for(j=1;j<8-i;j++) {
				System.out.print(j);
			}
			System.out.println();
	}
}
}
