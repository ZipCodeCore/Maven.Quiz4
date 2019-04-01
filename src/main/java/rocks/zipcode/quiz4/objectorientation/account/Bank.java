package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankAccountList;

    public Bank() {
        this(null);
    }

    public Bank(List<BankAccount> bankAccountList) {
        if(bankAccountList == null)
            this.bankAccountList = new ArrayList<>();
        else
            this.bankAccountList = bankAccountList;
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount account = bankAccountList.get(indexNumber);
        bankAccountList.remove(account);
        return account;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccountList.contains(bankAccount);
    }
}
