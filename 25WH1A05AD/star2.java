package mypackage5ad;

public class star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		for(int i=7;i>0;i--)
	     {
	    	 for(j=0;j<i;j++)
	    	 {
	    		 System.out.print(" ");
	    		 if(j==i-1)
	    		 {
                 break;
	    		 }
	    	 }
	    	 for(int k=j;k<7;k++)
	    	 {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println("\r");
	     }
	}

}
