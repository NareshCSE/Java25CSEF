package mypackage5bd;
interface Bank{
	void createaccount(String name);
	void creditamount(double amount);
	void debitamount(double amount);
	void transferamount(double amount);
	void ministatement();
	double rateofinterest();
}
class SBI implements Bank{
	double balance=0;
	String name;
	public void createaccount(String name) {
		this.name=name;
		System.out.println("SBI created successfully");
	}
	public void creditamount(double amount) {
		balance=balance+amount;
	}
	public void debitamount(double amount) {
		balance=balance-amount;
	}
	public void transferamount(double amount) {
		balance=balance-amount;
	}
	public void ministatement() {
		System.out.println("name="+name);
		System.out.println("balance="+balance);
	}
	public double rateofinterest() {
		return 7.0;
	}
}
class axis implements Bank{
	double balance=0;
	String accountname;
	@Override
	public void createaccount(String accountname) {
		// TODO Auto-generated method stub
	    this.accountname=accountname;
		System.out.println("axis bank created successfully");
	}
	public void creditamount(double amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		
	}
	public void debitamount(double amount) {
		// TODO Auto-generated method stub
		balance=balance-amount;
	}
	public void transferamount(double amount) {
		// TODO Auto-generated method stub
		balance=balance-amount;
	}
	public void ministatement() {
		// TODO Auto-generated method stub
		System.out.println("name="+accountname);
		System.out.println("balance="+balance);
		
	}
	public double rateofinterest() {
		// TODO Auto-generated method stub
		return 7.5;
	}
	
}

