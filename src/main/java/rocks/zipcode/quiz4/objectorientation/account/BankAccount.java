package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.balance = 0d;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy >= 0) {
            balance += amountToIncreaseBy;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy >= 0 && balance >= amountToDecreaseBy) {
            balance -= amountToDecreaseBy;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
