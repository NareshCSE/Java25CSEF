package mypackage5cg;

public class matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int matrix1[][]= {
        		          {1,2},
        		          {3,4}
        };
        int matrix2[][]= {
        		{5,6},
        		{8,9}
        };
        int[][] c = new int[2][2];
        for(int i=0 ; i<2 ; i++)
        {
        	for(int j = 0 ; j< 2; j++) {
        		for(int k = 0 ; k<2 ; k++) {
        			c[i][j] += matrix1[i][k] * matrix2[k][j];
        		}
        	}
        }
       for(int i=0; i<2 ; i++) {
    	   for(int j=0;j<2;j++) {
    		   
    			   System.out.print(c[i][j]+" ");
    		   
    	   }
    	   System.out.println();
       }
	}
}
