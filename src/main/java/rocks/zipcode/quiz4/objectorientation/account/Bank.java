package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class Bank implements Transactable{
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        throw new UnsupportedOperationException("Method not yet implemented");
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
