package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Account implements Transactable {

    private Long id ;

    public Account() {
    }



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

    }

    @Override
    public Double getBalance() {
        return null;
    }
}
