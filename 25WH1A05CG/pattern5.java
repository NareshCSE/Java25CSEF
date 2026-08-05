package mypackage5cg;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i = n ; i >= 1 ; i--)
		{
			for(int j = n ; j > i ; j-- ) {
				System.out.print(" ");
			}
			for(char ch='A';ch<'A'+i;ch++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		

	}

}
