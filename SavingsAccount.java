

public class SavingsAccount {
   public double balance;
   public double interestRate = 0.1;
   public String nama;

   public void deposit(int x){
      balance += x;

   }//end menthod deposit

   public double calcInterest(){
      return balance * interestRate;

   }
   public void displayCustomer(){
      System.out.println("Customer: "+nama);
      System.out.println("Balance: "+balance);
      System.out.println("Rate:"+interestRate);
      System.err.println();

   }//end menthod displayCustomer
}//end class SavingAccount

