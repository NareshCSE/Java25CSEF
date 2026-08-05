package mypackage5cc;

public class Pattern {

	public static void main(String[] args) {
		int rows=7;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

//---------pattern 2---------------
		
		int rows=7;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				if(j<rows-i-1)
				{
				System.out.print(" ");
			    }
				else {
				System.out.print("*");
			}
			}
			System.out.println();
		}

		
//---------pattern 3--------------

			for(int i=0;i<7;i++)
		{
				for(int k=0;k<7-i-1;k++)
				{
					System.out.print(" ");
				}
				for(int m=0;m<=i;m++)
				{
				System.out.print("* ");
				}
			System.out.println();
		}
		for(int i=6;i>0;i--)
		{
				for(int k=0;k<=7-i-1;k++)
				{
					System.out.print(" ");
				}
				for(int m=0;m<i;m++)
				{
					System.out.print("* ");
				}
			
			System.out.println();
		}


//----------pattern 4-------------


		for(int i=1;i<8;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<=7-i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}


//-----------pattern 5----------


		int n=7;
	    for(int i=n;i>0;i--) {
	    	for(int j=0;j<n-i;j++) {
	    		System.out.print(" ");
	    	}
	    	for(char ch='A';ch<'A'+i;ch++) {
	    		System.out.print(ch);
	    	}
	    	System.out.println();
	    }


	}

}
