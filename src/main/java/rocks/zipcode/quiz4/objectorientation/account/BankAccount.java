package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {

    private Double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    @Override
    public void deposit(Double increaseBy) {
        balance += increaseBy;
    }

    @Override
    public void withdrawal(Double decreaseBy) {
        balance -= decreaseBy;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double initialBalance) {
        this.balance = initialBalance;
    }
}
