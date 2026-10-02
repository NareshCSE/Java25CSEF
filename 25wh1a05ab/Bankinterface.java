package javaprograms;

interface Bank {
    void createAccount(String name, int accountNumber, double initialBalance);
    void creditAmount(double amount);
    boolean debitAmount(double amount);
    boolean transferAmount(Bank receiver, double amount);
    void miniStatement();
    double getRateOfInterest();
}

// SBI Implementation
class SBI implements Bank {
    private String name;
    private int accountNumber;
    private double balance;

    @Override
    public void createAccount(String name, int accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        System.out.println("SBI Account created successfully!");
    }

    @Override
    public void creditAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("SBI: Amount credited = ₹" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    @Override
    public boolean debitAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("SBI: Amount debited = ₹" + amount);
            return true;
        }
        System.out.println("SBI: Insufficient balance or invalid amount.");
        return false;
    }

    @Override
    public boolean transferAmount(Bank receiver, double amount) {
        if (debitAmount(amount)) {
            receiver.creditAmount(amount);
            System.out.println("SBI: Transfer successful!");
            return true;
        }
        return false;
    }

    @Override
    public void miniStatement() {
        System.out.println("\n----- SBI MINI STATEMENT -----");
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }

    @Override
    public double getRateOfInterest() {
        return 7.0;
    }
}

// Axis Implementation
class Axis implements Bank {
    private String name;
    private int accountNumber;
    private double balance;

    @Override
    public void createAccount(String name, int accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        System.out.println("Axis Account created successfully!");
    }

    @Override
    public void creditAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Axis: Amount credited = ₹" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    @Override
    public boolean debitAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Axis: Amount debited = ₹" + amount);
            return true;
        }
        System.out.println("Axis: Insufficient balance or invalid amount.");
        return false;
    }

    @Override
    public boolean transferAmount(Bank receiver, double amount) {
        if (debitAmount(amount)) {
            receiver.creditAmount(amount);
            System.out.println("Axis: Transfer successful!");
            return true;
        }
        return false;
    }

    @Override
    public void miniStatement() {
        System.out.println("\n----- AXIS MINI STATEMENT -----");
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }

    @Override
    public double getRateOfInterest() {
        return 7.5;
    }
}

public class Banks {
    public static void main(String[] args) {
        // Late Binding
        Bank sbi = new SBI();
        Bank axis = new Axis();

        // Create accounts
        sbi.createAccount("Rahul", 101, 5000);
        axis.createAccount("Priya", 102, 3000);

        // Credit amount
        sbi.creditAmount(2000);
        axis.creditAmount(1000);

        // Debit amount
        sbi.debitAmount(500);

        // Transfer amount from SBI to Axis
        sbi.transferAmount(axis, 1000);

        // Mini statements
        sbi.miniStatement();
        axis.miniStatement();

        // Rate of interest
        System.out.println("\nSBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("Axis Rate of Interest: " + axis.getRateOfInterest() + "%");
    }
}
