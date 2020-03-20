package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> bankAccountList;

    public Bank() {
        this.bankAccountList = new ArrayList<>();
    }

    public void removeBankAccountByIndex(Integer indexNumber) {
        bankAccountList.remove(bankAccountList.get(indexNumber));
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
//        throw new UnsupportedOperationException("Method not yet implemented");
        return bankAccountList.contains(bankAccount);
    }
}
