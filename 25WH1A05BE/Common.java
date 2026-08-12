package mypackage5be;

import java.util.Scanner;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first array size:");
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.println("Enter first array elements:");
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		
		System.out.println("Enter second array size:");
		int m=input.nextInt();
		int[] b=new int[m];
		System.out.println("Enter second array elements:");
		for(int i=0;i<m;i++) {
			b[i]=input.nextInt();
		}
		
		System.out.println("The common elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]+" ");
				}
			}
		}

	}

}
