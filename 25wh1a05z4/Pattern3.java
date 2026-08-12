package myproject5z4;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<7;i++) {
			for(j=8-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(i=1;i<=7;i++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<8;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
 
	}

}
