package rocks.zipcode.quiz4.objectorientation.account;

import static java.lang.Math.abs;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    Double accountBalance;

    public BankAccount(){
        this.accountBalance = 0.0;
    }

    public void setBalance(Double val) {
        this.accountBalance =val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy < 0) throw  new IllegalArgumentException();

        accountBalance += amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (abs(amountToDecreaseBy) > this.accountBalance || this.accountBalance == 0){
            throw new IllegalArgumentException();
        }
        accountBalance -= amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return this.accountBalance;
    }
}
