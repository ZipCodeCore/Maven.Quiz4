package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private Double amount;

    public BankAccount() {
        super();
        this.amount = 0.0;
    }

    public BankAccount(Long id) {
        super(id);

        this.amount = 0.0;
    }

    public void setBalance(Double val) {
        this.amount = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy >= 0){
            this.amount+= amountToIncreaseBy;
        }else
            throw new IllegalArgumentException();

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy < 0 || amountToDecreaseBy > amount) {
            throw new IllegalArgumentException();
        } else {
            amount -= amountToDecreaseBy;
        }
    }

    @Override
    public Double getBalance() {
        return amount;
    }
}
