package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    public ArrayList<BankAccount> Accounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        int index = indexNumber;
        BankAccount bankAccount = Accounts.get(indexNumber);
        Accounts.remove(index);
        return bankAccount;
    }


    public void addBankAccount(BankAccount bankAccount) {
        Accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if(Accounts.contains(bankAccount)) {
            return true;
        }
        return false;
    }
}