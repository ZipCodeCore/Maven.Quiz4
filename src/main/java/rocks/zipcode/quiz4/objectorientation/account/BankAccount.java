package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private Double val;
    public void setBalance(Double val) {
        this.val=val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        val=val-amountToIncreaseBy;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        val=amountToDecreaseBy;

    }

    @Override
    public Double getBalance() {
        return val;
    }
}
