package mypackage5ck;

import java.util.Scanner;

public class PrimeFibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		System.out.println("Output:");
		for(int num=2;num<=n;num++)
		{
			boolean prime=true;
			for(int i=2;i<num;i++) {
				if(num%i==0)
				{
					prime=false;
					break;
				}
			}
			int a=0,b=1;
			boolean fibanocci=false;
			while(a<=n)
			{
				if(a==num)
				{
					fibanocci=true;
					break;
				}
				int c=a+b;
				a=b;
				b=c;
			}
			if(prime && fibanocci)
			{
				System.out.println(num+" ");
			}
		}
	}

}
