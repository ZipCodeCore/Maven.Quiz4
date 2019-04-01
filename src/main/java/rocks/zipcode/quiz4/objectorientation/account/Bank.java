package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private Integer accid;
    private BankAccount bankAcc;

    public Integer getAccid() {
        return accid;
    }

    public void setAccid(Integer accid) {
        this.accid = accid;
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {


        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAcc = bankAccount;
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if(bankAccount == bankAcc){
            return true;
        }else
            return false;
    }
}
