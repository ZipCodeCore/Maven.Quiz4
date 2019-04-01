package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> bankAccounts;

    public Bank(ArrayList<BankAccount> bankAccounts){
        this.bankAccounts = bankAccounts;
    }

    public Bank(){
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount removed = bankAccounts.get(indexNumber);
        bankAccounts.remove(bankAccounts.get(indexNumber));
        return removed;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (bankAccounts.contains(bankAccount)){
            return true;
        }
        return false;
    }
}
