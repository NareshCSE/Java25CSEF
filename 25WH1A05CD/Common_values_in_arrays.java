package mypackage5cd;
import java.util.Scanner;

public class Common_Values_in_Arrays {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] array1=new String[5];
		System.out.println("Enter string values of array1:");
		for(int i=0;i<array1.length;i++) {
			array1[i]=input.next();
		}
		String[] array2=new String[5];
		System.out.println("Enter string values of array2:");
		for(int i=0;i<array2.length;i++) {
			array2[i]=input.next();
		}
		if(array1.length==array2.length) {
		for(int i=0;i<array1.length;i++) {
			if(array1[i].equals(array2[i])) {
				System.out.println("Common String value at "+i+" position ");
				
			}
			
		}
		}
        
	}

}
