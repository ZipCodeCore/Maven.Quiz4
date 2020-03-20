package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    public ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>();


    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        int index = indexNumber;
        BankAccount bankAccount = listOfBankAccounts.get(indexNumber);
        listOfBankAccounts.remove(index);
        return bankAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        listOfBankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if(listOfBankAccounts.contains(bankAccount)) {
            return true;
        }
        return false;
    }
}
