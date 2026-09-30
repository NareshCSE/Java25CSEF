package oopj_aa;

interface BankServices {
    double INTEREST_RATE = 5.0;
    void createAccount(String name, double initialAmount);
    void creditAmount(double amount);
    void debitAmount(double amount);
    void transferAmount(double amount, String targetAccount);
    void miniStatement();
}

class SBI implements BankServices {
    String name;
    double balance;

    public void createAccount(String name, double initialAmount) {
        this.name = name;
        this.balance = initialAmount;
        System.out.println("SBI Account created for " + name);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("SBI: Credited " + amount);
    }

    public void debitAmount(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("SBI: Debited " + amount);
        } else {
            System.out.println("SBI: Insufficient balance");
        }
    }

    public void transferAmount(double amount, String targetAccount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("SBI: Transferred " + amount + " to " + targetAccount);
        } else {
            System.out.println("SBI: Transfer failed. Low balance.");
        }
    }

    public void miniStatement() {
        System.out.println("SBI Balance: " + balance + " (Interest Rate: " + INTEREST_RATE + "%)");
    }
}

class Axis implements BankServices {
    String name;
    double balance;

    public void createAccount(String name, double initialAmount) {
        this.name = name;
        this.balance = initialAmount;
        System.out.println("Axis Account created for " + name);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("Axis: Credited " + amount);
    }

    public void debitAmount(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Axis: Debited " + amount);
        } else {
            System.out.println("Axis: Insufficient balance");
        }
    }

    public void transferAmount(double amount, String targetAccount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Axis: Transferred " + amount + " to " + targetAccount);
        } else {
            System.out.println("Axis: Transfer failed. Low balance.");
        }
    }

    public void miniStatement() {
        System.out.println("Axis Balance: " + balance + " (Interest Rate: " + INTEREST_RATE + "%)");
    }
}

public class BankInterfaceDemo {
    public static void main(String[] args) {
        BankServices bank1 = new SBI();
        bank1.createAccount("John", 5000);
        bank1.creditAmount(1000);
        bank1.debitAmount(500);
        bank1.transferAmount(1200, "ACC123");
        bank1.miniStatement();

        System.out.println();

        BankServices bank2 = new Axis();
        bank2.createAccount("Alice", 8000);
        bank2.creditAmount(2000);
        bank2.debitAmount(1500);
        bank2.transferAmount(3000, "ACC456");
        bank2.miniStatement();
    }
}