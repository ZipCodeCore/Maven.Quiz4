package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable  {
    Double balance=0.0;

    public BankAccount(){
        super();

    }

    public BankAccount(Long id) {
        super(id);
    }

    public BankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }


    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.balance += amountToIncreaseBy;
        if (amountToIncreaseBy < 0 || balance < 0)
            throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.balance -= amountToDecreaseBy;
        if(amountToDecreaseBy < 0 || balance < 0)
            throw new IllegalArgumentException();
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
