package myproject;

interface Bank {

    void createAccount(String name, long accNo);
    void creditAmount(double amount);
    void debitAmount(double amount);
    void transferAmount(double amount, long toAccount);
    void miniStatement();
    double getRateOfInterest();
}

class SBI implements Bank {

    String name;
    long accNo;
    double balance = 0;

    public void createAccount(String name, long accNo) {
        this.name = name;
        this.accNo = accNo;
        System.out.println("SBI Account Created");
    }

    public void creditAmount(double amount) {
        balance = balance + amount;
    }

    public void debitAmount(double amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    public void transferAmount(double amount, long toAccount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Transferred to Account: " + toAccount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void miniStatement() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public double getRateOfInterest() {
        return 7.0;
    }
}

class Axis implements Bank {

    String name;
    long accNo;
    double balance = 0;

    public void createAccount(String name, long accNo) {
        this.name = name;
        this.accNo = accNo;
        System.out.println("Axis Account Created");
    }

    public void creditAmount(double amount) {
        balance = balance + amount;
    }

    public void debitAmount(double amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    public void transferAmount(double amount, long toAccount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Transferred to Account: " + toAccount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void miniStatement() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public double getRateOfInterest() {
        return 7.5;
    }
}

public class BankTest {

    public static void main(String[] args) {

        Bank b;

        // Late Binding
        b = new SBI();

        b.createAccount("Rahul", 12345);
        b.creditAmount(10000);
        b.debitAmount(2000);
        b.transferAmount(1000, 67890);
        b.miniStatement();

        System.out.println("SBI Interest Rate: "
                + b.getRateOfInterest() + "%");

        System.out.println();

        b = new Axis();

        b.createAccount("Priya", 56789);
        b.creditAmount(15000);
        b.debitAmount(3000);
        b.transferAmount(2000, 11111);
        b.miniStatement();

        System.out.println("Axis Interest Rate: "
                + b.getRateOfInterest() + "%");
    }
}
