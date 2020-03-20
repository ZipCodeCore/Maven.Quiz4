package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> bankAccounts;

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {

        return bankAccounts.remove(indexNumber.intValue());
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        for (BankAccount account : bankAccounts) {
            if(bankAccount.equals(account)) {
                return true;
            }
        }
        return false;
//        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
