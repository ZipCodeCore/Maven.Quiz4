package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private Double balance;

    public BankAccount(){
        balance = 0.0;
    }

    public void setBalance(Double val) {
        balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy >= 0.0) {
                balance += amountToIncreaseBy;
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (balance - amountToDecreaseBy < 0 || amountToDecreaseBy < 0){
            throw new IllegalArgumentException();
        }
        else {
            balance -= amountToDecreaseBy;
        }
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
