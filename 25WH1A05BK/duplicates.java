package myproject5bk;

import java.util.Scanner;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int sz=input.nextInt();
		int arr[]=new int[sz];
		System.out.println("enter the array elements:");
		for(int i=0;i<sz;i++) {
		arr[i]=input.nextInt();
		}
		for(int k=0;k<sz;k++) {
			int flag=0;
			for(int j=k+1;j<sz;j++) {
				if(arr[k]==arr[j]) {
					if(flag==0) {
					System.out.println(arr[k]+"is a duplicate");
					flag=1;
				}
			}
		}
	}}

}
