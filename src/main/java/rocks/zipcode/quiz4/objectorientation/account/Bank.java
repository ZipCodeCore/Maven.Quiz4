package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> accounts = new ArrayList<>();


    public BankAccount removeBankAccountByIndex(int indexNumber) {
        accounts.remove(indexNumber);

        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);
        //throw new UnsupportedOperationException("Method not yet implemented");
    }
}
