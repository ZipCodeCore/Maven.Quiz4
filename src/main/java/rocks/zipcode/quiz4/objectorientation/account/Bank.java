package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    ArrayList<BankAccount> accounts;
    public Bank(){
        accounts = new ArrayList<>();
    }

    public void removeBankAccountByIndex(Integer indexNumber) {
        int indexToRemove = indexNumber;
        accounts.remove(indexToRemove);
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);
    }
}
