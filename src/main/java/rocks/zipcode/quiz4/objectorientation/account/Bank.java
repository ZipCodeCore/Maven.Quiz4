package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private Integer indexNumber;
    private BankAccount bankAccount;
    private  ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {

        BankAccount account = bankAccounts.get(indexNumber);
        bankAccounts.remove(account);

        return account;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

        return bankAccounts.contains(bankAccount);
    }


    public Integer getIndexNumber() {
        return indexNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public List getBankAccounts() {
        return bankAccounts;
    }

    public void setIndexNumber(Integer indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
/*
    public void setBankAccounts(List bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

 */
}
