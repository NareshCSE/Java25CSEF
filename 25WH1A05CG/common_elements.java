package mypackage5cg;

public class common_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] array1= {"sita","ram","laxman"};
         String[] array2= {"ram","apple","laxman"};
         String[] array3 = { };
         for(int i=0;i<array1.length;i++) {
        	 for(int j=0;j<array2.length;j++) {
        		 if(array1[i]==array2[j]) {
        			 System.out.println(array1[i]);
        			 break;
        		 }
        	 }
         }
         
	}

}
