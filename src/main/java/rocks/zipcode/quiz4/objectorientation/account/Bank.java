package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> accountList;

    public Bank(){
        this.accountList = new ArrayList<BankAccount>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount removed = accountList.get(indexNumber);
        accountList.remove((int) indexNumber);
        return removed;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accountList.contains(bankAccount);

    }
}