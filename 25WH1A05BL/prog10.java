package myproject5bl;

class Bank{
	int getBalance() {
		return 0;
	}
}
class BankA extends Bank{
	int getBalance(int da) {
		return da;
	}
}
class BankB extends Bank{
	int getBalance(int da) {
		return da;
	}
}
class BankC extends Bank{
	int getBalance(int da) {
		return da;
	}
}
public class pro10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA bankA=new BankA();
		BankB bankB=new BankB();
		BankC bankC=new BankC();
		System.out.println(bankA.getBalance(65454));
		System.out.println(bankB.getBalance(432423));
		System.out.println(bankC.getBalance(643232));
		

	}

}


