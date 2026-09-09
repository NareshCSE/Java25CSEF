package jasmitha;
interface Bank{
	void createAccount(String name,long accNo);
	void creditAmount(double amount);
	void debitAmount(double amount);
	void transferAmount(long toAcc,double amount);
    public double getRateOfInterest();
    void miniStatement();
	}
 class SBI implements Bank{
	double balance=0;
	String name;
	long accNo;
	public void createAccount(String name,long accNo) {
		this.name=name;
		this.accNo=accNo;
		System.out.println(name);
		System.out.println(accNo);
		
	}
	 public void creditAmount(double amount) {
	        balance = balance + amount;
	        System.out.println("Credited: " + amount);
	    }

	    public void debitAmount(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Debited: " + amount);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }
	    public void transferAmount(long toAccount, double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Transferred " + amount + " to Account " + toAccount);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    public void miniStatement() {
	        System.out.println("SBI Account No: " + accNo);
	        System.out.println("Balance: " + balance);
	    }

	    public double getRateOfInterest() {
	        return 6.5;
	    }

	
}
class Axis implements Bank{

	  String name;
	    long accountNo;
	    double balance = 0;

	    public void createAccount(String name, long accountNo) {
	        this.name = name;
	        this.accountNo = accountNo;
	        System.out.println("Axis Account Created");
	    }

	    public void creditAmount(double amount) {
	        balance = balance + amount;
	        System.out.println("Credited: " + amount);
	    }

	    public void debitAmount(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Debited: " + amount);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    public void transferAmount(long toAccount, double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Transferred " + amount + " to Account " + toAccount);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    public void miniStatement() {
	        System.out.println("Axis Account No: " + accountNo);
	        System.out.println("Balance: " + balance);
	    }

	    public double getRateOfInterest() {
	        return 7.0;
	    }

}

public class BankInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank b;
      b=new SBI();
      b.createAccount("Ravi", 12345);
      b.creditAmount(5000);
      b.debitAmount(1000);
      b.transferAmount(67890, 500);
      b.miniStatement();
      System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());

      System.out.println();

      b=new Axis();
      b.createAccount("Ravi", 54321);
      b.creditAmount(8000);
      b.debitAmount(2000);
      b.transferAmount(98765, 1000);
      b.miniStatement();
      System.out.println("Axis Rate of Interest: " + b.getRateOfInterest());
	}

}
