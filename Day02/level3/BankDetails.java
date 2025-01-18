class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class SavingsAccount extends BankAccount {
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankDetails {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 123456;
        account.accountHolder = "vikas";
        account.setBalance(5000);

        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(1500);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(2000);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountNumber = 654321;
        savingsAccount.accountHolder = "vikas";
        System.out.println("\nSavings Account Details:");
        savingsAccount.displayDetails();
    }
}
