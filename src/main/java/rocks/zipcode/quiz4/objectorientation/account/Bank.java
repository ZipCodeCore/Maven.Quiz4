package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> listOfAccounts;

    public Bank() {

        this.listOfAccounts = new ArrayList<>();
    }

    public Bank(List<BankAccount> bankAccountList) {
        if (bankAccountList.equals(null))
            this.listOfAccounts = new ArrayList<>();
        else
            this.listOfAccounts = bankAccountList;
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount account = listOfAccounts.get(indexNumber);
        listOfAccounts.remove(account);
        return account;
    }

    public void addBankAccount(BankAccount bankAccount) {

        listOfAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");

        return listOfAccounts.contains(bankAccount);


    }
}
