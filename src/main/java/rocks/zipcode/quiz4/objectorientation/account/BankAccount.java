package rocks.zipcode.quiz4.objectorientation.account;

import com.sun.javafx.util.Logging;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    Double balance;

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if ( amountToIncreaseBy >= 0){
            this.balance = balance + amountToIncreaseBy;
        }
        else {
            throw new IllegalArgumentException("Value must be non-negative");
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if ( (amountToDecreaseBy > 0) && (balance - amountToDecreaseBy) >= 0 ){
            this.balance = balance - amountToDecreaseBy;
        }
        else {
            throw new IllegalArgumentException("Value must be non-positive");
        }
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }



}
