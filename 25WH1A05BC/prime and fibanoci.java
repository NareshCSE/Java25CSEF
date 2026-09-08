package myproject;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
        Scanner input=new Scanner(System.in);

        System.out.println("enter the range:");

        int n=input.nextInt();

     	   for(int num=2;num<=n;num++) {

     		   boolean isPrime=true;

     	   for(int i=2;i<num;i++) {

     		   if(num%i==0) {

     			   isPrime=false;

     			   break;

     		   }

     	   }
     	   
     	   if(isPrime) {

     		   System.out.println(num);

     	   }

     	   } 
     	 System.out.println("Fibonaci series is:");
     	 
         int a = 0, b = 1;

         for (int i = 1; i <= n; i++) {
        	 
             System.out.print(a + " ");

             int c = a + b;
             a = b;
             b = c;
         }

     	 
     	
	}

}
