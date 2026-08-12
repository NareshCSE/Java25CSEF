package myproject;

public class Pattern2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=7;
			for (int i=1;i<=n;i++) 
			{
				for (int j=1;j<=n;j++) 
				{
					System.out.print(" ");
				}
				for (int k=1;k<=i;k++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			} 
		}

	}

