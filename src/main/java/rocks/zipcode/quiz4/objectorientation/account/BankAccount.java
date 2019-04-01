package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Double val;

    public BankAccount(){
        this.val = 0.0;
    }
    public void setBalance(Double val) {
        this.val = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy < 0)
            throw new IllegalArgumentException();
        this.val+=amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(amountToDecreaseBy < 0 || amountToDecreaseBy > this.val)
            throw new IllegalArgumentException();
        this.val-=amountToDecreaseBy;
    }

    public Double getBalance(){
        return this.val;
    }
}
