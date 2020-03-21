package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {


    private Double balance = 0.00;

    private Long id;

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.balance += amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.balance = balance;
        if(amountToDecreaseBy < balance)    {
            balance = balance - amountToDecreaseBy;
        }
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public Long getId() {
        return super.getId();
    }


}
