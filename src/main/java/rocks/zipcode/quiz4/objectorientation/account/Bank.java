package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> bankAccountsList;

    public Bank() {
        bankAccountsList = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(int indexNumber) {
        BankAccount acctRemoved = this.bankAccountsList.get(indexNumber);
        this.bankAccountsList.remove(indexNumber);
        return acctRemoved;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccountsList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (bankAccountsList.contains(bankAccount))
            return true;
        else
            return false;
    }
}
