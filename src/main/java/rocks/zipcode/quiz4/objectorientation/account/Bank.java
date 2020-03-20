package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public void removeBankAccountByIndex(Integer indexNumber) {
         bankAccounts.remove(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);

    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return true;
    }
}
