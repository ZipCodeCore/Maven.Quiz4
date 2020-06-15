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

        BankAccount bankAccount = bankAccounts.get(indexNumber);
        if(bankAccounts.contains(bankAccount)){
        bankAccounts.remove(bankAccount);}
        return bankAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

            return bankAccounts.contains(bankAccount);


    }
}
