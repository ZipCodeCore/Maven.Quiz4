package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Account {
    Long id = 0L;

    public Account(Long id) {
       this.id = id;
    }

    public Account(BankAccount bankAccount) {
    }

    public Account() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
