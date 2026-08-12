package myproject5cb;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=input.nextInt();
		System.out.println("enter b value:");
		int b=input.nextInt();
		PrimeNumber obj=new PrimeNumber();
		obj.primeNumber(a, b);

	}
	int primeNumber(int a,int b) {
		for(int i=a;i<=b;i++) { 
			int count=0;
			for (int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
				
			}
		
		if(count==2) {
			System.out.println(i);
		}
			
		}
		return 0;
	
	}
	
}
