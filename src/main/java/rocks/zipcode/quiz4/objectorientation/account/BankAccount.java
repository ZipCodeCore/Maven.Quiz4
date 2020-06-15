package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    Double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy)   {

        if (amountToIncreaseBy < 0.0){
            throw new IllegalArgumentException();
        }else{
            balance += amountToIncreaseBy;

        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy < 0.0 || amountToDecreaseBy > balance) {
            throw new IllegalArgumentException();

        }else{
            balance -= amountToDecreaseBy;
        }

    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
