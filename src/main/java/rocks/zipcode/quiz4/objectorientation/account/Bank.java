package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> bankAccounts = new ArrayList<>();

    public boolean removeBankAccountByIndex(Integer indexNumber) {
        BankAccount temp = null;

        if (bankAccounts.size() > 0 && indexNumber <= bankAccounts.size()){
            temp = bankAccounts.get(indexNumber);
            bankAccounts.remove(temp);
        }
        return containsBankAccount(temp);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccounts.contains(bankAccount);
    }
}
