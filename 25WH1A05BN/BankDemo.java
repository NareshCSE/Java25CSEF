package myproject;

class Bankbalance {

    int getBalance() {
        return 0;
    }
}

class BankA extends Bankbalance {

    int getBalance() {
        return 1000;
    }
}

class BankB extends Bankbalance {

    int getBalance() {
        return 1500;
    }
}

class BankC extends Bankbalance {

    int getBalance() {
        return 2000;
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Bank A Balance: $" + a.getBalance());
        System.out.println("Bank B Balance: $" + b.getBalance());
        System.out.println("Bank C Balance: $" + c.getBalance());
    }
}
