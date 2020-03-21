package rocks.zipcode.quiz4.objectorientation.account;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

        private ArrayList<BankAccount> accounts;

        public Bank() {
            this.accounts = new ArrayList<>();
        }

        public Bank(ArrayList<BankAccount> bankAccounts) {
            this.accounts = bankAccounts;
        }


        public BankAccount removeBankAccountByIndex(int index) {
            return accounts.remove(index);
        }

        public void addBankAccount(BankAccount bankAccount) {
            accounts.add(bankAccount);
        }

        public Boolean containsBankAccount(BankAccount bankAccount) {
            return accounts.contains(bankAccount);
        }
}
