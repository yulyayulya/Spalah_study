package BankSystem.account;

public class CheckingAccount extends Account {
    private double balance;
    private double overdraft;

    public CheckingAccount(double balance, double overdraft) {
        super(balance);
        if (overdraft < 0) {
            System.out.println("Overdraft is less than 0");
        } else {
            this.overdraft = overdraft;
        }
    }

    @Override
    public void withdraw(double money) {
        double available = getBalance() + overdraft;
        if (available < money) {
            System.out.println("Out of overdraft limit");
        } else {
            setBalance(getBalance() - money);
        }
    }

    @Override
    public String toString() {
        return "CheckindAccount <-> balance: " + getBalance() + ", overdraft: " + overdraft;
    }
}
