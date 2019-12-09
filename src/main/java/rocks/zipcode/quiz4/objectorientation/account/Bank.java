package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> bankAccounts;

    public Bank() {
        bankAccounts = new ArrayList<>();
    }

    public void removeBankAccountByIndex(Integer indexNumber) {
        bankAccounts.remove(bankAccounts.get(indexNumber));

    }

    public Integer size(){
        return bankAccounts.size();
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccounts.contains(bankAccount);
    }
}
