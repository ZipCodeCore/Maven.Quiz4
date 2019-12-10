package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    Integer AccId = 0;
    Map<Integer, BankAccount> bankAccounts = new HashMap<>();
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return bankAccounts.remove(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.put(AccId, bankAccount);
        AccId++;
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i) == bankAccount){
                return true;
            }
        }
        return false;
    }
}
