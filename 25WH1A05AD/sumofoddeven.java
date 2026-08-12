package mypackage5ad;

import java.util.Scanner;

public class sumofoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Enter no.of elements ");
       int n=input.nextInt();
       int sum1=0,sum2=0;
       System.out.println("enter elements");
       for(int i=0;i<n;i++)
       {
    	   int a=input.nextInt();
    	   if(a%2==0)
    	   {
    		   sum1=sum1+a;
    	   }
    	   else
    		   sum2=sum2+a;
       }
       System.out.println("sum of even numbers="+sum1);
       System.out.println("sum of odd numbers="+sum2);
	}

}
