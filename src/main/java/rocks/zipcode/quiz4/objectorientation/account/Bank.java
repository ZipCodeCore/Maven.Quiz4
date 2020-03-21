package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> allAccounts = new ArrayList<>();
    public void removeBankAccountByIndex(Integer indexNumber) {
        int number = indexNumber;
        allAccounts.remove(number);

    }

    public void addBankAccount(BankAccount bankAccount) {
        allAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

        return allAccounts.contains(bankAccount);
    }
}
