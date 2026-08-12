package mypackage5ch;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
			   System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
