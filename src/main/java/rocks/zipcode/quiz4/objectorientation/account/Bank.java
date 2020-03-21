package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> bankAccountList;
    public Bank(){
        bankAccountList= new ArrayList<>();
    }
    public void removeBankAccountByIndex(Integer indexNumber) {
        BankAccount valueToRemove= bankAccountList.get(indexNumber);
        //Iterator<BankAccount> it = bankAccountList.iterator();
//        while (it.hasNext()) {
//
//            bankAccountList.remove(valueToRemove);
//        }

        bankAccountList.remove(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");

        if(bankAccountList.contains(bankAccount))
            return true;
        else
            return false;
    }
}
