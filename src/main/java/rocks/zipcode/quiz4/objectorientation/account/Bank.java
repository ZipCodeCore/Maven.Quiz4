package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    public Bank(){
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
