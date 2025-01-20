// Sample Program 1: Bank Account System
// Create a BankAccount class with the following features:
// Static:
// A static variable bankName shared across all accounts.
// A static method getTotalAccounts() to display the total number of accounts.
// This:
// Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
// Final:
// Use a final variable accountNumber to ensure it cannot be changed once assigned.
// Instanceof:
// Check if an account object is an instance of the BankAccount class before displaying its details.




class BankAccount{ 
    static String bankName="CBI";   

    static int count=0; 

    private String accountHolderName; 
    final int accountNumber;

    public BankAccount(String accountHolderName,int accountNumber)
    {  this.accountHolderName=accountHolderName; 
        
        this.accountNumber=accountNumber;
         count++;

    }
    static public void  getTotalAccounts() 
    {
          System.out.println("total accounts present : "+ count);
    }   

    public void display() 
    {
        System.out.println("Account holder is "+accountHolderName+" and account number is "+accountNumber+" of "+bankName+" bank");
    }



}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("vikas sahu", 83434343); 

        BankAccount account2=new BankAccount("Shivam ", 273728273); 
         
        BankAccount.getTotalAccounts();// because it is static method

        if(account1 instanceof BankAccount) 
        { 
           account1.display();
        } 
        if(account2 instanceof BankAccount) 
        { 
            account2.display();
        }

    }
}
