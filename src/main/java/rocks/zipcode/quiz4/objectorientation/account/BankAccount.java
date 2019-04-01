package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private double balance;


    public void setBalance(Double val) {
        this.balance =val;
    }


    @Override
    public void deposit(Double amountToIncreaseBy) {
        double newBalance = balance + amountToIncreaseBy;
        balance = newBalance;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        double newBalance = balance - amountToDecreaseBy;
        balance = newBalance;
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
