package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    Double balance;

    public BankAccount() {
        super();
        this.balance = 0.0;
    }

    public BankAccount(Long id, Double balance) {
        super(id);
        this.balance = balance;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException{
        if(amountToIncreaseBy < 0) {
            throw new IllegalArgumentException();
        } else {
            balance = balance + amountToIncreaseBy;
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException{
        if((balance < amountToDecreaseBy) || amountToDecreaseBy < 0) {
            throw new IllegalArgumentException();
        } else {
            balance = balance - amountToDecreaseBy;
        }
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
