package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankAccountList;
public Bank(){
    bankAccountList = new ArrayList<>();
}



    public BankAccount removeBankAccountByIndex(Integer indexNumber) {




    return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        if (!bankAccountList.contains(bankAccount)) {
            bankAccountList.add(bankAccount);
        }

    }
    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (bankAccountList.contains(bankAccount)) {
            return true;}
            else

            throw new UnsupportedOperationException("Method not yet implemented");
        }
    }

