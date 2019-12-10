package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> accounts;




    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public Bank(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }


    public void removeBankAccountByIndex(Integer indexNumber) {
        this.accounts.remove(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.accounts.contains(bankAccount);
      //  throw new UnsupportedOperationException("Method not yet implemented");
    }
}
