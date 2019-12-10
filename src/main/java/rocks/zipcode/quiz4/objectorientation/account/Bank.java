package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }
    public Boolean removeBankAccountByIndex(Integer indexNumber) {
        return accounts.remove(accounts.get(indexNumber));
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
       // throw new UnsupportedOperationException("Method not yet implemented");
        return accounts.contains(bankAccount);
    }
}
