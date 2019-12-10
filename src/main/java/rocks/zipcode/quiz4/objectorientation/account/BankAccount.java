package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private Double balance;

    public void setBalance(Double val) {
        this.balance = val;
    }

    public BankAccount(){
        this.balance = 0.00;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy >= 0) setBalance(getBalance() + amountToIncreaseBy);
        else throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        // MAYBE ALSO PUT A QUALIFIER TO ENSURE SUFFICIENT FUNDS?
        // DO THEY HAVE OVERDRAFT PROTECTION, OR CAN THEY GO NEGATIVE?
        if (amountToDecreaseBy < 0 || amountToDecreaseBy > getBalance()) throw new IllegalArgumentException();
        setBalance(getBalance() - amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
