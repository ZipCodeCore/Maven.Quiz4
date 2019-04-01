package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Account {
    Long id = 0L;

    public Account() {
        super();
    }

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @Override
//    public void deposit(Double amountToIncreaseBy) {
//        this.balance += amountToIncreaseBy;
//    }
//
//    @Override
//    public void withdrawal(Double amountToDecreaseBy) {
//        this.balance -= amountToDecreaseBy;
//    }
//
//    @Override
//    public Double getBalance() {
//        return this.balance;
//    }
}
