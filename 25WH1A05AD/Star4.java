
package mypackage5ad;

public class Star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int i=1;i<=7;i++)
		     {
			  int k=65,j;
		    	 for(j=1;j<=7;j++)
		    	 {
		    		 if(j==i)
		    		 {
		    			 break;
		    		 }
		    		 System.out.print(" ");
		    		 }
		    	 for(int d=j;d<=7;d++)
		    	 {
		    		 System.out.print((char)k);
		    		 k++;
		    	 }
		    	 System.out.println();
		     }

	}

}
