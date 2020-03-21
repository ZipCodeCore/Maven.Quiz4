package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank extends Account{
    private List<BankAccount> accounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount bankAccount = accounts.get(indexNumber);
        this.accounts.remove((int) indexNumber);
        return bankAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if(this.accounts.contains(bankAccount)) {
            return true;
        } else {
            return false;
        }
    }
}
