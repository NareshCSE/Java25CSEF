package mypackage5z2;

public class Pattern2 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		  { for(int i=1;i<7;i++)
		  { for(int j=1;j<8-i;j++)
		  { System.out.print(" "); } 
		  for(int j=1;j<i;j++) 
		  { System.out.print("* "); } 
		  System.out.println(); } 
		  for(int i=1;i<8;i++) 
		  { for(int j=1;j<i;j++)
			  
		  { System.out.print(" "); } 
		  for(int j=8;j>i+1;j--) 
		  { System.out.print("* "); }
		  System.out.println(); 
		  }
		  } 
}
		

		
	
