package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    Double hourlyWage;
    Double hoursWorked ;
    Double balance ;
    Double bankAccountBalance ;
    //Double moneyEarned = hourlyWage * hoursWorked;
     BankAccount bankAccount = new BankAccount();
    public Employee(Double hourlyWage, Double hoursWorked, Double balance, Double bankAccountBalance)
    {
        this.hourlyWage = hourlyWage;
        this.hoursWorked =hoursWorked;
        this.balance = hourlyWage;
        this.bankAccountBalance = bankAccountBalance;
       //this.moneyEarned = hourlyWage * hoursWorked;
       // BankAccount bankAccount = new BankAccount();
    }

    public Employee() {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 15.0;
        this.bankAccountBalance = bankAccountBalance;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy >= 0)
        this.bankAccountBalance+= amountToIncreaseBy;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
    bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
     hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return  hourlyWage * hoursWorked;
    }
}
