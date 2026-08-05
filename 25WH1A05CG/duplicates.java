package mypackage5cg;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,3,4,1,2,3,3};
		int n=array1.length;
		for(int i = 0 ; i<n ;i++) {
			
			boolean alreadyprinted= false;
			
			for(int k = 0; k < i; k++) {
				if(array1[i]==array1[k]) {
				alreadyprinted=true;
				break;}
				
			}
			
			if(!alreadyprinted)
			{
			for (int j=i+1;j<n ;j++) {
				if(array1[i]==array1[j]) {
					System.out.println(array1[i]);
					break;
				}
			}
		}

	}

}
}
