package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Double balance = 0D;

    public BankAccount() {
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy >= 0)
            balance += amountToIncreaseBy;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(amountToDecreaseBy >=0 && amountToDecreaseBy <= balance)
            balance -= amountToDecreaseBy;
        else
            throw new IllegalArgumentException();
    }
}
