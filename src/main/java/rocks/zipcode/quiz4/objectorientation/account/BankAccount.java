package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{
    Double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException{
        if(amountToIncreaseBy < 0 ){
            throw new IllegalArgumentException();
        }
        this.balance += amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException {
        this.balance -= amountToDecreaseBy;
        if(this.balance < 0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
