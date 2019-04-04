package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private double balance;

    public BankAccount(){};

    public BankAccount(Long id) {
        super(id);
    }


    public void setBalance(Double val) {
        this.balance =val;
    }


    @Override
    public void deposit(Double amountToIncreaseBy) {
        double newBalance = balance + amountToIncreaseBy;
        if(newBalance< 0 || amountToIncreaseBy<0){
            throw  new IllegalArgumentException();
        }
        balance = newBalance;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        double newBalance = balance - amountToDecreaseBy;
        if(newBalance<0 || amountToDecreaseBy<0){
            throw new IllegalArgumentException();
        }
        balance = newBalance;
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
