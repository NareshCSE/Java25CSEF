package mypackage5ch;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
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
