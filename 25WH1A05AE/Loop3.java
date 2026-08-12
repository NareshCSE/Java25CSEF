package mypackage5ae;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=6;i++) {
			for(k=1;k<=8-i;k++)
				{
				System.out.print("  ");
				}
		    for(j=1;j<=i;j++)
		    	{
		    	System.out.print(" *  "); 
		    	}
			System.out.println("");	
		}	
		for(i=1;i<=7;i++) {
			for(k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(j=7;j>=i;j--) 
			{
				System.out.print(" *  ");
			}
			System.out.println();
		}
		

	}

}
