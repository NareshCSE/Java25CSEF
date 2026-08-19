package mypackage5cd;

public class Pattern_6 {

	public static void main(String[] args) {
		 int n=7;
	        for(int i=0;i<=n;i++){
	            for(int j=0;j<i;j++){
	                System.out.print(" ");
	            }
	            for(char ch='A';ch<'A'+(n-i);ch++){
	                System.out.print(ch);
	            }
	            System.out.println();
	        }

	}

}
