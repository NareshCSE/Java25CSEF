package mypackage5ch;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		 int m=6;
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<=i+1;j++) 
			 {
				 System.out.print(" ");
			 }
			 for(int j=i;j<m;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }

	}

}
