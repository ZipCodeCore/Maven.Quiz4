package rocks.zipcode.quiz4.objectorientation.account;

import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bank;

    public Bank(){
        bank = new LinkedList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return bank.remove((int)indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bank.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bank.contains(bankAccount);
    }
}
