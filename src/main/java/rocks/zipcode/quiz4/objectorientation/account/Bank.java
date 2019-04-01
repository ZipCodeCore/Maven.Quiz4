package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> bankAccountList;

    public Bank(){
        bankAccountList = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount bankAccount2 = new BankAccount();
        for (BankAccount bankAccount : bankAccountList) {
            Integer index;
            index = bankAccountList.indexOf(bankAccount);
            if (index.equals(indexNumber)){
                bankAccount2 = bankAccount;
            }
        }
        bankAccountList.remove(bankAccount2);
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (bankAccountList.contains(bankAccount))return true;
        else return false;
    }
}
