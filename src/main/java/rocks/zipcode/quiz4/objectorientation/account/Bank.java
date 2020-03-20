package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> accountList = new ArrayList<>();
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {

        return accountList.remove(indexNumber.intValue());
    }

    public void addBankAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");
        return accountList.contains(bankAccount);
    }
}
