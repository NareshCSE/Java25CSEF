package mypackage5ch;

public class array_duplicates {

	public static void main(String[] args) {
		int[] array1 = {1,2,4,4,4,2,4};
		int n=array1.length;
		for(int i=0; i<n; i++)
		{
			boolean isprinted = false;
			
			for(int k=0;k<i;k++)
			{
				if(array1[i]==array1[k])
				{
					isprinted = true;
					break;
				}
					
			}
			
			if(!isprinted)
			{
				  for(int j=i+1; j<n; j++)
			   {
				 if(array1[i]==array1[j])
				  {
					System.out.println(array1[i]);
					break;
				  }
			   }
		    }
		}
		
		

	}

}
