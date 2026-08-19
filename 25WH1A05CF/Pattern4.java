package mypackage5cf;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=7;i>=0;i--) {
			for(int j=0;j<7-i;j++) {
				System.out.print(" ");
				
			}
			for(char ch='A';ch<='A'+i;ch++) {
				System.out.print(ch);
				
			}
			System.out.println();
		}

	}

}
