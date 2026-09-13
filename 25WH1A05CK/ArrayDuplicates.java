package mypackage5ck;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] == arr[j]) {
		            System.out.println("Duplicate: " + arr[i]);
		            break;
		        }
		    }
		}
	}
}
