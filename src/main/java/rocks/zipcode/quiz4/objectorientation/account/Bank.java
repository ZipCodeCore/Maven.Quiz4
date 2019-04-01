package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> ba;

    public Bank() {
        this.ba  = new ArrayList();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount toBeRemoved = ba.get(indexNumber);
        ba.remove(indexNumber.intValue());

        return toBeRemoved;
    }

    public void addBankAccount(BankAccount bankAccount) {
        ba.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

        return ba.contains(bankAccount);
    }
}
