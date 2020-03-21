package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount toBeRemoved = accounts.get(indexNumber);
       accounts = accounts.stream().filter(a -> a != toBeRemoved).collect(Collectors.toList());
        return toBeRemoved;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);
    }


}
