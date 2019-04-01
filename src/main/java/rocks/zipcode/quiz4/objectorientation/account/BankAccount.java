package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Bank {
    Double balance = 0.0;

    public BankAccount() {
        super();
    }

    public void setBalance(Double val) {
        this.balance = val;
    }
}
