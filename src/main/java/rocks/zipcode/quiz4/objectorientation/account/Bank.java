package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<BankAccount> acctList = new ArrayList<>();


    public BankAccount removeBankAccountByIndex(Integer indexNumber)

    {


        acctList.remove(indexNumber);

       //return  acctList.get(indexNumber);

return null;
    }

    public void addBankAccount(BankAccount bankAccount) {

            acctList.add(bankAccount);


    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

    if (acctList.contains(bankAccount)){

        return true;
    }

    else

        return false;


           // throw new UnsupportedOperationException("Method not yet implemented");





    }
}
