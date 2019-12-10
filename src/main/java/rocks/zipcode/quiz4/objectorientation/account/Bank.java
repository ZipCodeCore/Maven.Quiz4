package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> accountArrayList = new ArrayList<>(0);

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {  //returns BankAccount
        BankAccount accountToRemove = accountArrayList.get(indexNumber);
        this.accountArrayList.remove(accountToRemove);
        return accountToRemove;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accountArrayList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");
        return this.accountArrayList.contains(bankAccount);
    }
}
