package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> baccounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount output = baccounts.get(indexNumber);
        baccounts.remove(output);
        return output;
    }

    public void addBankAccount(BankAccount bankAccount) {
        baccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return baccounts.contains(bankAccount);
    }
}
