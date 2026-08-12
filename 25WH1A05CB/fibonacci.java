package myproject5cb;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=input.nextInt();
		fibonacci obj=new fibonacci();
		obj.fibonacci(n);
	}
	int fibonacci(int n) {
		int a=0,b=1,c;
		System.out.println(a+" "+b+" ");
		int i=0;
		while(i<n-2) {
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
			i++;
		}
		
		return n;
		
		
	}
	
		
		

	}
