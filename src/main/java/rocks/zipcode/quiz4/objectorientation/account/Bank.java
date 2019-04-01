package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        accounts.remove(accounts.get(indexNumber));
        return new BankAccount();
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if(accounts.contains(bankAccount)){
            return true;
        } else {
            return false;
        }
        //throw new UnsupportedOperationException("Method not yet implemented");
    }
}
