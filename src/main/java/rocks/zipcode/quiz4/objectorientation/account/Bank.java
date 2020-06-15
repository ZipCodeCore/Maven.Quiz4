package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> bankAccountList=new ArrayList<BankAccount>();
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        bankAccountList.remove(indexNumber);
        return (BankAccount) bankAccountList;

    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

        return bankAccountList.contains(bankAccount);
    }
}
