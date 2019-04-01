package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount account = accounts.get(indexNumber);
        accounts.remove(account);
        return account;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);
    }
}
