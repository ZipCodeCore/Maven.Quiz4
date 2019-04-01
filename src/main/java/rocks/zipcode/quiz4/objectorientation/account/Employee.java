package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable  {
    public BankAccount bankAccount;
    public Double totalHours;
    public Double hourlyWage;
    public Double balance;
    //Double hoursWorked;

    public Employee() {
       this(null);
//        this.balance = 15.0;
    }

    public Employee(BankAccount bankAccount) {

        this.hourlyWage = 35.0;
        this.totalHours = 0.0;
        this.balance = 15.0;
        if(bankAccount != null)
            this.bankAccount = bankAccount;
        else
            this.bankAccount = new BankAccount();
//        this.hourlyWage = hourlyWage;

    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
       totalHours = getHoursWorked()+ numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return totalHours;
    }



    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return getHourlyWage()*getHoursWorked();
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy >= 0) {
            balance = bankAccount.getBalance() + amountToIncreaseBy;
            bankAccount.setBalance(balance);
        } else
            throw new IllegalArgumentException();
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
