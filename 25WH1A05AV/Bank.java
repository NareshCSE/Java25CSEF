package mypackage;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int total=1000000;
		int credit_now=0;
		int debit_now=0;
		int choice;
		int transfer_now=0;
		int option;
		
		do {Scanner input=new Scanner(System.in);
			System.out.println("1.create account 2.credit 3.debit 4.bank enqueiry 5.transfer 6.exit");
		    System.out.println("enter choice: ");
		    choice=input.nextInt();
		    
		    
	        switch(choice) {
		    case 1:
			    System.out.println("create account");
			    System.out.println("enter your name");
			    String name=input.next();
			    System.out.println("enetr Adhaar no ");
			    int Adhaar=input.nextInt();
			    System.out.println("enetr Pan no");
			    int Pan=input.nextInt();
			    System.out.println("Account Succesfully Created!");
			    break;
		    case 2:
			    System.out.println("credit");
			    System.out.println("enter account no to credit");
			    int accno=input.nextInt();
			    System.out.println("enter amount to be credited");
			    int credit=input.nextInt();
			    credit_now=total+credit;
			    System.out.println(credit +" is credited Succesfully into "+accno);
			    System.out.println("account balance is "+credit_now);
			    break;
		    case 3:
			    System.out.println("debit");
			    System.out.println("enter account no to debit");
			    int accno1=input.nextInt();
			    System.out.println("enter amount to be debited");
			    int debit=input.nextInt();
			    debit_now=total-debit;
			    System.out.println(debit +" is debited Succesfully from "+accno1);
			    System.out.println("account balance is "+debit_now);
			    
			    break;
		    case 4:
			    System.out.println("balance enqueiry");
			    do {
			    System.out.println("1.account balance 2.exit");
			    System.out.println("enter choice: ");
			    option=input.nextInt();
			    switch(option) {
			    case 1:
			    	System.out.println("enter account no:");
			    	int accno2=input.nextInt();
			    	System.out.println("your balance is "+total);
			    	break;
			    case 2:
			    	break;
			    }
			    }while(option<1);
			    
		        
		        break;
	        case 5:
		        System.out.println("transfer");
		        System.out.println("enter acc no which is being transefered");
		        int accno3=input.nextInt();
		        System.out.println("enter acc no which money should be debited from");
		        int accno4=input.nextInt();
		        System.out.println("enter amount to be transfered from "+accno4+"to"+accno3);
		        int transfer=input.nextInt();
		        transfer_now=total+transfer;
		        System.out.println(transfer+" is succefully transfered to "+accno3);
		        System.out.println("acoount balance is "+transfer_now);
		        break;
	        case 6:
	    	    break;
	    	}
		}while(choice<6);
	
}
}




