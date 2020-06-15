package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    public void setBalance(Double val) {
        balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy >= 0)
            setBalance(balance + amountToIncreaseBy);
        else
            throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(amountToDecreaseBy <= balance && amountToDecreaseBy >= 0)
            setBalance(balance - amountToDecreaseBy);
        else
            throw new IllegalArgumentException();
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
