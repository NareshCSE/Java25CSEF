package mypackage5ch;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		int m=6;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
