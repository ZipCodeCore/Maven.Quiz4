package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Double balance;

    public BankAccount() {
        this.balance = 0.00;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    public void deposit(Double val) {
        if (val > 0) this.setBalance(this.getBalance()+val);
        else throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy < 0 || this.getBalance() < amountToDecreaseBy)
            throw new IllegalArgumentException();
        else
            this.setBalance(this.getBalance()-amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
