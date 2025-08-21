public class AccountTest {
    public static void main(String[] args) {

        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.nama = "putri";
        sa0001.balance = 5000 ;
        sa0001.deposit(1000);
        sa0001.balance += sa0001.calcInterest();
        sa0001.balance += 0.5;
        sa0001.displayCustomer();

        SavingsAccount sa0002 = new SavingsAccount();
        sa0002.nama ="wawa";
        sa0002.balance = 4000;
        sa0002.deposit(2000);
        sa0002.balance += sa0002.calcInterest();
        sa0002.balance += 0.1;
        sa0002.displayCustomer();

        SavingsAccount sa0003 = new SavingsAccount();
        sa0003.nama = "vanes";
        sa0003.balance = 1000;
        sa0003.deposit(2000);
        sa0003.balance = 0.2;
        sa0003.balance += sa0003.calcInterest();
        sa0003.displayCustomer();

        
    }//end class AccountTest
}
