package BankSystem.account;



public class SavingAccount extends Account{
    private double balance;

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public String toString() {
        return "SavingAccount <-> balance: + getBalance()";
    }
}
