package BankSystem;

/**
 * Created by user on 27.12.16.
 */
public enum Gender {

    male("Mr."),
    female("Mrs.");

    private final String salutation;

    Gender(String salutation) {
        this.salutation = salutation;
    }

    public String getSalutation() {
        return salutation;
    }
}
