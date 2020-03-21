package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> allAccounts = new ArrayList<BankAccount>();
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        allAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

        return allAccounts.contains(bankAccount);
    }
}
