package rocks.zipcode.quiz4.objectorientation.account;

import com.sun.javafx.util.Logging;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private double balance;

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if ( amountToIncreaseBy >= 0){
            balance += amountToIncreaseBy;
        }
        else {
            throw new IllegalArgumentException("Value must be non-negative");
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {



        boolean isInvalidAmount = amountToDecreaseBy < 0;
        boolean isGreaterThanFunds = amountToDecreaseBy > balance;
        if ( isInvalidAmount || isGreaterThanFunds){
//        if ( (amountToDecreaseBy > 0) && (balance - amountToDecreaseBy) >= 0 ){
            throw new IllegalArgumentException("Value must be non-positive");
        }
            balance -= amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return balance;
    }



}
