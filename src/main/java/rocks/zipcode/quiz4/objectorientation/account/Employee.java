package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable  {
    BankAccount bankAccount;
    Double numberOfHours;
    Double HourlyWage;
    Double balance;

    public Employee() {
       this.bankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
       numberOfHours = getHoursWorked()+ numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return numberOfHours;
    }

    @Override
    public Double getHourlyWage() {
        return HourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return getHourlyWage()*getHoursWorked();
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
       balance = bankAccount.getBalance()+ amountToIncreaseBy;

    }
    //  if(amountToIncreaseBy>0) {
    //            val = getBalance() + amountToIncreaseBy;
    //        }else
    //            throw new  IllegalArgumentException();
    //
    //    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
      balance = bankAccount.getBalance()- amountToDecreaseBy;

    }

    @Override
    public Double getBalance() {
        balance = bankAccount.getBalance();
        return balance;
    }
}
