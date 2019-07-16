package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public interface Transactable {

    void deposit(Double increaseBy);
    void withdrawal(Double decreaseBy);
    Double getBalance();

}
