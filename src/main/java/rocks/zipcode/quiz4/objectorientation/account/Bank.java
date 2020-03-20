package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public Boolean removeBankAccountByIndex(Integer indexNumber) {
        BankAccount temp = null;

        if (accounts.size() > 0 && indexNumber <= accounts.size()){
            temp = accounts.get(indexNumber);
            accounts.remove(temp);

        }
       return containsBankAccount(temp);
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);

    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
       return accounts.contains(bankAccount);
    }
}
