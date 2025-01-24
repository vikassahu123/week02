// Sample Problem 1: Bank Account Types
// Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:
// Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.
// Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.



class BankAccount 
{ 
    int accountNumber; 
    double balance;

    public BankAccount(int accountNumber,double balance) 
    { 
        this.accountNumber=accountNumber; 
        this.balance=balance; 

    }
} 

class SavingsAccount extends BankAccount 
{ 
    int interestRate; 
    public SavingsAccount(int accountNumber,double balance,int interestRate) 
    { 
       super(accountNumber, balance); 

        this.interestRate=interestRate;     
    } 

    public void displayAccountDetails() 
    { 
         System.out.println("Account number is "+accountNumber); 
         System.out.println("Your saving account balance is "+balance); 
         System.out.println("interest rate is "+interestRate); 
    }
} 

class CheckingAccount extends BankAccount 
{ 
    int withdrawalLimit; 
    public CheckingAccount(int accountNumber,double balance,int withdrawalLimit) 
    { 
       super(accountNumber, balance); 
        this.withdrawalLimit=withdrawalLimit; 

    } 

    public void displayAccountDetails() 
    { 
         System.out.println("Account number is "+accountNumber); 
         System.out.println("Your checking account balance is "+balance); 
         System.out.println("withdrawal limit is "+withdrawalLimit); 
    }
} 

class FixedDepositAccount extends BankAccount 
{ 
    int depositLimit; 
    public FixedDepositAccount(int accountNumber,double balance,int depositLimit) 
    { 
       super(accountNumber, balance);  
        this.depositLimit=depositLimit; 

    } 

    public void displayAccountDetails() 
    { 
         System.out.println("Account number is "+accountNumber); 
         System.out.println("Your Fixed Deposit account balance is "+balance); 
         System.out.println("Fixed Deposit limit is "+depositLimit); 
    }
}
public class BankAccountSystem 
{ 
    public static void main(String []args) 
    { 
            SavingsAccount s=new SavingsAccount(32244234, 348088, 3); 
            s.displayAccountDetails(); 

            CheckingAccount c=new CheckingAccount(873738, 900000, 5000); 
            c.displayAccountDetails(); 

            FixedDepositAccount f=new FixedDepositAccount(24223413, 560000, 100000);
            f.displayAccountDetails(); 

    }
}