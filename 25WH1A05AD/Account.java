package mypackage5ad;

import java.util.Scanner;
import java.util.Random;
public class Account {
	int accountno = 0;
    int Balance=0;
    int amt=0;
    int account=0;
    int origin=100,boundary=1000;
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	       Scanner input=new Scanner(System.in);
	       Account obj1=new Account();
	       int ch=0;
	      do {
	       System.out.println("1.Account Creation \n2.Crediting Amount\n3.Debiting Amount\n4.Check Balance\n5.Transfer Money\n6.Exit");
	       System.out.println("Enter your choice");
	       ch=input.nextInt();
	       switch(ch)
	       {
	    	   case 1:
	    		   System.out.println("Enter name");
	    		   String name=input.next();
	    	       System.out.println("Enter your Aadhar number");
	    	       int aadhar=input.nextInt();
	    	       System.out.println("Enter your PAN number");
	    	       String pan=input.next();
	    	       Random rand=new Random();
	    	       obj1.accountno=rand.nextInt(obj1.origin,obj1.boundary);
	    	       System.out.println("account no="+obj1.accountno);
	    	       System.out.println("Aadhar account Successfully created!!");
	    		   break;
	    	   case 2:
	    	       System.out.println("Enter your Account Number");
	    	       obj1.account=input.nextInt();
	    	       if(obj1.account==obj1.accountno)
	    	       {
	    	    	   System.out.println("Enter amount to be credited");
	    	    	   obj1.amt=input.nextInt();
	    	    	   obj1.Balance+=obj1.amt;
	    	       System.out.println("Amount credited!");
	    	       }
	    		   break;
	    	   case 3:
	    		   System.out.println("Enter your Account Number");
	    	       obj1.account=input.nextInt();
	    	       if(obj1.account==obj1.accountno)
	    	       {
	    	    	   System.out.println("Enter amount to be debited");
	    	    	   obj1.amt=input.nextInt();
	    	    	   obj1.Balance-=obj1.amt;
	    	       System.out.println("Amount debited!");
	    	       }
	    		   break;
	    	   case 4:
	    		   System.out.println("Enter your Account Number");
	    	       obj1.account=input.nextInt();
	    	       if(obj1.account==obj1.accountno)
	    	       {
	    	    	   System.out.println("Balance="+obj1.Balance);
	    	       System.out.println("Amount debited!");}
	    		   break;     
	    	   case 5:
	    		   System.out.println("Enter your Account Number");
	    	       obj1.account=input.nextInt();
	    	       if(obj1.account==obj1.accountno)
	    	       {
	    	    	   System.out.println("Enter destination account number");
	    	    	   int account2=input.nextInt();
	    	    	   System.out.println("Enter amount to be transferred");
	    	    	   obj1.amt=input.nextInt();
	    	    	   obj1.Balance-=obj1.amt;
	    	       System.out.println("Amount transferred!");
	    	       }
	    		   break;
	       }
		}while(ch<6);
	}

	}


