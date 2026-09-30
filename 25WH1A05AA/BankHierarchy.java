package oopj_aa;

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

public class BankHierarchy {
    public static void main(String[] args) {
        Bank b1 = new BankA();
        Bank b2 = new BankB();
        Bank b3 = new BankC();

        System.out.println("Bank A Balance: $" + b1.getBalance());
        System.out.println("Bank B Balance: $" + b2.getBalance());
        System.out.println("Bank C Balance: $" + b3.getBalance());
    }
}