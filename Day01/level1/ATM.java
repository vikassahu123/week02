import java.util.*;
class  BankAccount{ 
    private String accountHolder; 
    private double accountNumber; 
    private double balance; 

   public BankAccount(String accountHolder, double accountNumber,double balance) 
    { 
      this.accountHolder=accountHolder; 
      this.accountNumber=accountNumber; 
      this.balance=balance; 

    } 

    public double depositAmount(Double newAmount ) 
    { 
        balance+=newAmount;  

        return balance;

    }  

    public double withdrawl(double newAmount) 
    { 
        if(balance>0 && balance<=newAmount) 
        {
            balance-=newAmount; 
          System.out.println("withdrawling amount is = "+ newAmount);  
          
        } 
        else 
        {
            System.out.println("In sufficient balance");  
            
        } 
        return balance;
    } 

    public void details() 
    {     System.out.println("you want to deposite or withdrawl an amount ");
          System.out.println("if you want to deposite press 1 ");
          System.out.println("if you want to withdrawl press 2 "); 
          
          Scanner s=new Scanner(System.in);  
          int ans=s.nextInt();  
          System.out.println("enter amount = ");  
          double newamount=s.nextDouble();
          if(ans==1) 
          { depositAmount( newamount); 
          }
          else if(ans==2) 
          { 
            withdrawl(newamount); 
          } 
         

          
        System.out.println("New Updateted Balance is= "+ balance);
    }

}  


public class ATM { 
    public static void main(String[] args) {
       
         

         double PreBalance=100000.0; 

         BankAccount b=new BankAccount("vikas", 27363, PreBalance); 

         b.details();
    }
    
}
