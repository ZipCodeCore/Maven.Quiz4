package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    Double accountBalance;

    public void setBalance(Double val) {
        this.accountBalance =val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        accountBalance =+ amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        accountBalance -= amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return this.accountBalance;
    }
}
