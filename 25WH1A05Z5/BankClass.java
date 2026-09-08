package jasmitha;

class Bankk{
	int getBalance(){
		return 0;
	}
}
class BankA extends Bankk{
	int getBalance() {
		return 1000;
	}
}
class BankB extends Bankk{
	int getBalance() {
		return 1500;
	}
}
class BankC extends Bankk{
	int getBalance() {
		return 2000;
	}
}



public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BankA b1=new BankA();
   System.out.println(  b1.getBalance());
     BankB b2=new BankB();
    System.out.println( b1.getBalance());
    BankC b3=new BankC();
    System.out.println( b3.getBalance());
     
	}

}
