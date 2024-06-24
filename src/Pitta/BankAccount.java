package Pitta;

public class BankAccount {
    double balance =1000;
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount bankAccount=new BankAccount();
        bankAccount.withdraw(2000);
    }
    public void withdraw( double amount) throws InsufficientFundsException{
        if(amount<balance) {
            balance -= amount;
        }
        if(amount>balance){
           throw new InsufficientFundsException("amount is greater than balance");
        }


    }
}
