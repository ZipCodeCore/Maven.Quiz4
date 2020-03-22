package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> list = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        int i = indexNumber;
        return list.remove(i);
    }

    public void addBankAccount(BankAccount bankAccount) {
        list.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");
        return list.contains(bankAccount);
    }
}
