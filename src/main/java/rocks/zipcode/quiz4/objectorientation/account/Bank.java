package rocks.zipcode.quiz4.objectorientation.account;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

        private List<BankAccount> bankAccounts = new ArrayList<>();

        public BankAccount removeBankAccountByIndex(int indexNumber) {
            return bankAccounts.remove(indexNumber);
        }

        public void addBankAccount(BankAccount bankAccount) {
            bankAccounts.add(bankAccount);
        }

        public Boolean containsBankAccount(BankAccount bankAccount) {
            return bankAccounts.contains(bankAccount);
        }
}
