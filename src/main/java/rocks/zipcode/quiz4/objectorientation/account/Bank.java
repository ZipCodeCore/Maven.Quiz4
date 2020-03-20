package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankaccounts;


    public Bank() {
        this.bankaccounts = new ArrayList<>();
    }



    public BankAccount removeBankAccountByIndex(int indexNumber) {
        BankAccount bankacc = bankaccounts.get(indexNumber);

       bankaccounts.remove(bankacc);
        return bankacc;
    }

    public void addBankAccount(BankAccount bankAccount) {

        this.bankaccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if(bankaccounts.contains(bankAccount)){
            return true;
        }
            return false;
    }
}
