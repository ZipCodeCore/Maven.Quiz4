package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount implements Transactable {
    private Double balance = 0.0;

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        setBalance(getBalance() + amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        deposit(-amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
