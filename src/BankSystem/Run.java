package BankSystem;

import BankSystem.account.CheckingAccount;
import BankSystem.account.SavingAccount;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import java.util.Scanner;

/**
 * Created by user on 29.12.16.
 */
public class Run {
    public static void main(String[] args) {
        bank bank = new bank();
        Client yuli = new Client("Yuli ", Gender.female);
        Client misha = new Client("Misha ", Gender.male);

        SavingAccount sa = new SavingAccount(1000);
        CheckingAccount ca = new CheckingAccount(500, 100);
        yuli.addAccount(sa);
        yuli.addAccount(ca);
        yuli.setActiveAccount(ca);
        bank.addClient(yuli);
        Scanner in = new Scanner(System.in);
        System.out.println(" Write client name ");
        String name = in.nextLine();
        System.out.println(bank.getClientinfo(name));
        System.out.println(yuli.equals(misha));
        System.out.println(yuli.hashCode());
        System.out.println(misha.hashCode());
        ca.withdraw(150);
        System.out.println(ca.getBalance());
        System.out.println(Gender.female.getSalutation());
    }
}
