package mypackage5cd;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array=new int[10];
		System.out.println("Enter array values:");
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Array values are:");
        for(int i=0;i<array.length;i++) {
        	System.out.print(array[i]+" ");	
        }
        System.out.println();
        for(int i=0;i<array.length;i++) {
        	for(int j=i+1;j<array.length;j++) {
        		if(array[i]==array[j]) {
        			System.out.println(array[i]+" is a Duplicate value.");
        		}
        	}
        }
	}

}
