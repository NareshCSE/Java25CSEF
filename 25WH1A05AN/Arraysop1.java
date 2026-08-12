package mypackage5an;

public class Arraysop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,8,2,1,3,6,8,1,2,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+"has duplicates");
					break;
				}
			}
		}

	}

}
