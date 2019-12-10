package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    Collection<BankAccount> bankAccounts;

    public Bank(){
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        Integer count = 0;
        for(BankAccount ba : bankAccounts){
            if(count.equals(indexNumber)){
                bankAccounts.remove(ba);
                return ba;
            }
            count++;
        }
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccounts.contains(bankAccount);
    }
}
