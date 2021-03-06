package BankSystem;

import BankSystem.account.Account;
import BankSystem.account.CheckingAccount;
import BankSystem.account.SavingAccount;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private String name;
    private Gender gender;
    private Account activeAccount;
    private ArrayList<Account> accounts = new ArrayList<>();


    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void addAccount(Account account) {
        if (accounts.size() != 0) {
            activeAccount = account;
        }
        accounts.add(account);
    }


    public void setActiveAccount(Account account) {
        if (accounts.contains(account)) {
            activeAccount = account;
        }
        else {
            System.out.println("Account hasn't been created");
        }
    }


    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (Account account: accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name = " + name +
                ",\n activeAccount = " + activeAccount +
                ",\n accounts = " + accounts +
                "}";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Client other = (Client) otherObject;
        return Objects.equals(name, other.name) && Objects.equals(gender, other.gender);
    }

    @Override
    public  int hashCode() {
        return Objects.hash(name, gender);

    }



}
