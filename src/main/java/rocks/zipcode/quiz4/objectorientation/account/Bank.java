package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
//        BankAccount temporal = bankAccounts.get(indexNumber.intValue());
        bankAccounts.remove(indexNumber.intValue());
        return null;
//        return temporal;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");
        return bankAccounts.contains(bankAccount);
    }
}
