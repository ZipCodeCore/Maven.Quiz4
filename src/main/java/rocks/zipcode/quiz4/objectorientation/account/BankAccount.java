package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Long id;
    private Double balance;

    public BankAccount(Long id, Double balance){
        this.id = super.getId();
        this.balance = balance;
    }

    public BankAccount(){
        this.id = null;
        this.balance = 0.0;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance = getBalance() + amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy > 0) {
            balance = balance - amountToDecreaseBy;
        } else {
            balance = balance - (amountToDecreaseBy * -1);
        }
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
