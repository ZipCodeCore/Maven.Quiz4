package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return this.bankAccounts.remove((int) indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        for(BankAccount b : this.bankAccounts){
            if(bankAccount.equals(b)) return true;
        }
        return false;
    }
}
