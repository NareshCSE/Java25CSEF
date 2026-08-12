package mypackage5bq;

import java.util.Scanner;

public class duplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("duplicated elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				    break;
				}
			}
		}
	}
}
