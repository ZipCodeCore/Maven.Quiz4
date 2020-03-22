package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */

public class BankAccount extends Account implements Transactable {

    public double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(Double val) {
        this.balance = val;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy < 0.0) {
            throw new IllegalArgumentException("error");
        }
        this.balance += amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if ((this.balance - amountToDecreaseBy < 0.0)|| (amountToDecreaseBy < 0.0)) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            this.balance -= amountToDecreaseBy;
        }
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}