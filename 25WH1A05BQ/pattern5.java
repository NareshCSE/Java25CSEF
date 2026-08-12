package mypackage5bq;
import java.util.Scanner;
public class Pattern5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
