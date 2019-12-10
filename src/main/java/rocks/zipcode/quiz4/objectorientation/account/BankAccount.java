package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    Double balance;

    public BankAccount () {
        this.balance = 0.0;
    }

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException {
        if (amountToIncreaseBy >= 0) {
            balance = this.getBalance();
            balance += amountToIncreaseBy;
            setBalance(balance);
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException{
        balance = this.getBalance();
        if (amountToDecreaseBy > balance || amountToDecreaseBy < 0) {
            throw new IllegalArgumentException();
        }
        else {
            balance -= amountToDecreaseBy;
            this.setBalance(balance);
        }
    }

    public Double getBalance() {
        return balance;
    }
}
