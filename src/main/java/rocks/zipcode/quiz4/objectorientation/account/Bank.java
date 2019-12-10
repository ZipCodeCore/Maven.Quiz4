package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankAccountList = new ArrayList<>();


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
