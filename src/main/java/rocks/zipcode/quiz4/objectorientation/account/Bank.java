package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class Bank extends Account implements Transactable  {
   private BankAccount bankAccount;
   private Integer indexNumber;


    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
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
