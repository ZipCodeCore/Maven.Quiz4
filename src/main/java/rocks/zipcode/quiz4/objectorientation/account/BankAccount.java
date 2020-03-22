package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private Double balance;

    public BankAccount() { balance = 0.0; }

    public void setBalance(Double val) { this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy < 0.0){
            throw new IllegalArgumentException("Cannot deposit negative number!");
        } else {
            balance += amountToIncreaseBy;
        }

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy > 0 && this.balance >= amountToDecreaseBy) {
            this.balance -= amountToDecreaseBy;
        } else {
            throw new IllegalArgumentException("Cannot process transaction");
        }
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
