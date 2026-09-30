package mypackage5bd;

class bank{

	int getBalance() {

		return 0;

	}

}

class BankA extends bank{

	int getBalance(){

		return 1000;

	}

}

class BankB extends bank{

	int getBalance(){

		return 1500;

	}

}

class BankC extends bank{

    int getBalance() {

		return 2000;

	}

}

public class Bankextends {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BankA A=new BankA();

		BankB B=new BankB();

		BankC C=new BankC();



		System.out.println("money despoited:$"+A.getBalance());

		System.out.println("money despoited:$"+B.getBalance());

		System.out.println("money deposited:$"+C.getBalance());



	}

}


