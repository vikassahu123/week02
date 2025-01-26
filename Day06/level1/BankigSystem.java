
// Banking System
// Description: Create a banking system with different account types:
// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
// Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
// Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
// Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
// Use encapsulation to secure account details and restrict unauthorized access.
// Demonstrate polymorphism by processing different account types and calculating interest dynamically.
interface Loanable{
    public void applyForLoan();
    public void calculateLoanEligibility();
}
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    private double interest;
    public BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
      public void setInterest(double interest){
        this.interest=interest;}
        public double getBalance(){
            return balance;
        }

    public abstract void calculateInterest();
    public void displayDetails(){
        System.out.println("account number is: "+ accountNumber);
        System.out.println("account holder name is: "+ holderName);
        System.out.println("account balance is: "+ balance);
        System.out.println("account interest is: "+ interest);
    }
}
class SavingsAccount extends BankAccount implements Loanable{
    private double interest;
    public SavingsAccount(int accountNumber,String holderName,double balance){
        super(accountNumber, holderName, balance);
    }
    public void calculateInterest(){
        interest=getBalance()*0.05;
        setInterest(interest);
    }
    public void applyForLoan(){
        System.out.println("you can apply for loan");
    }
    public void calculateLoanEligibility(){
        System.out.println("you are eligible for loan");
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    private double interest;
    public CurrentAccount(int accountNumber,String holderName,double balance){
        super(accountNumber, holderName, balance);
    }
    public void calculateInterest(){
        interest=getBalance()*0.02;
        setInterest(interest);
    }
    public void applyForLoan(){
        System.out.println("You can apply for loan");
    }
    public void calculateLoanEligibility(){
        System.out.println("You are eligible for loan");
    }
}

public class BankigSystem {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(1111, "Dipak", 10000);
        sa.deposit(5000);
        sa.withdraw(2500);
        sa.calculateInterest();
        sa.displayDetails();
        sa.applyForLoan();
        sa.calculateLoanEligibility();
        System.out.println();
        CurrentAccount ca=new CurrentAccount(5678, "Ram", 20000);
        ca.deposit(10000);
        ca.withdraw(5000);
        ca.calculateInterest();
        ca.displayDetails();
        ca.applyForLoan();
        ca.calculateLoanEligibility();
    }
    
}

