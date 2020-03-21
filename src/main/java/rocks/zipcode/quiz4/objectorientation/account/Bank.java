package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> bankAccounts;

    public Bank(){
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        int ind = indexNumber;
        if(bankAccounts.size() > 0);
        this.bankAccounts.remove(ind);
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.bankAccounts.contains(bankAccount);
    }
}
