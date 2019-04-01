package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Double balance;
    
    public void setBalance(Double val) {
        balance = val;
    }
    
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy < 0) {
            throw new IllegalArgumentException("Can't deposit negative amounts");
        }
        balance = balance + amountToIncreaseBy;
    }
    
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy < 0) {
            throw new IllegalArgumentException("Can't withdraw negative amounts");
        }
        balance = balance - amountToDecreaseBy;
    }
    
    public Double getBalance() {
        return balance;
    }
}
