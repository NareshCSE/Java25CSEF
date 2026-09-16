package myproject5z4;
class Bank {
    int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    int getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    int getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 2000;
    }
}

public class BankDeposit {
    public static void main(String[] args) {

        BankA objA = new BankA();
        BankB objB = new BankB();
        BankC objC = new BankC();

        System.out.println("Bank A balance: " + objA.getBalance());
        System.out.println("Bank B balance: " + objB.getBalance());
        System.out.println("Bank C balance: " + objC.getBalance());
    }
}
