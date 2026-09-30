package mypackage5bd;

public class Pro11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI b=new SBI();
		b.createaccount("divya");
		b.creditamount(10000);
		b.debitamount(2500);
		b.transferamount(3200);
		b.ministatement();
		System.out.println("interest="+b.rateofinterest());
		axis a=new axis();
		a.createaccount("vaishu");
		a.creditamount(1200);
		a.debitamount(320);
		a.transferamount(560);
		a.ministatement();
		System.out.println("interest="+a.rateofinterest());

	}

}
