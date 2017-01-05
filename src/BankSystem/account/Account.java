package BankSystem.account;

/**
 * Created by user on 27.12.16.
 */
public abstract class Account {

    private double balance;

    public Account(double balance) {
        if (balance < 0) {
            System.out.println("Your balance is less than 0");
        }
        else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double money) {
        if (money < 0) {
            System.out.println("Please, add money");
        }
        else {
            balance += money;
        }
    }

    public  void withdraw(double money) {
         if (money > balance) {
             System.out.println("You didn't have enough money on your account ");
         }
         else {
             balance -= money;
         }
    }

    public abstract String toString();
}
