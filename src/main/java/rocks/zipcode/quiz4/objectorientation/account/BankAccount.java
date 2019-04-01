package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {

    Double bal = 0.0;

    public void setBalance(Double val) {

        this.bal = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        if(amountToIncreaseBy<0){
            throw new IllegalArgumentException();
        }
        else{
            bal+=amountToIncreaseBy;
        }

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

        if(bal< amountToDecreaseBy || amountToDecreaseBy<0){
            throw new IllegalArgumentException();
        }
        else{
            bal -= amountToDecreaseBy;
        }

    }

    @Override
    public Double getBalance() {
        return bal;

    }
}
