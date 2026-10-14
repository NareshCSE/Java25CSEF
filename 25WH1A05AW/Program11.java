package mypackage5aw;
interface Bank {
    void createAccount(String name);
    void credit(double amount);
    void debit(double amount);
    double getBalance();
}

class SBI implements Bank {
    double balance = 0;

    public void createAccount(String name) {
        System.out.println("SBI account created for " + name);
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Axis implements Bank {
    double balance = 0;

    public void createAccount(String name) {
        System.out.println("Axis account created for " + name);
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class Program11{
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.createAccount("Ravi");
        b.credit(5000);
        System.out.println("SBI Balance = " + b.getBalance());

        b = new Axis();
        b.createAccount("Priya");
        b.credit(8000);
        b.debit(2000);
        System.out.println("Axis Balance = " + b.getBalance());
    }
}
