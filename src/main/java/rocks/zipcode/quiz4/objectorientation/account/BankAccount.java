package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private double balance = 0.0;

    public void setBalance(Double balance) {
    this.balance = balance;
    }

    public void withdrawal(Double amountToDecreaseBy) {
    if(amountToDecreaseBy < 0){
        throw new IllegalArgumentException();
    }

        balance -= amountToDecreaseBy;

    }


    public void deposit(Double amountToIncreaseBy) {
    if(amountToIncreaseBy < 0){
        throw new IllegalArgumentException();
    }

        balance += amountToIncreaseBy;

    }


    public Double getBalance() {
    return balance;
    }
}
