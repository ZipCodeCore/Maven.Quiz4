package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    ArrayList<BankAccount> allAccounts = new ArrayList<>();

    public void removeBankAccountByIndex(int indexNumber) {
        // THIS WAS TRYING TO REMOVE THE Integer OBJECT, SO I CHANGED IT TO AN int......
//        BankAccount removedAccount = allAccounts.get(indexNumber);
        allAccounts.remove(indexNumber);
//        return removedAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        allAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
//        throw new UnsupportedOperationException("Method not yet implemented");
        return allAccounts.contains(bankAccount);
    }
}
