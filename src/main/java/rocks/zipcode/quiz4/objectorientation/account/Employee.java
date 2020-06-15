package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    private BankAccount bankAccount;
    private Double balance;
    private Double hoursWorked;
    private Double hourlyWage;
    private Double moneyEarned;

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setMoneyEarned(Double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }



    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setNumberOfHours(Double numberOfHours) {
        this.hoursWorked = numberOfHours;
    }

    public void setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }


    public Employee() {
        this.bankAccount=new BankAccount();
        this.balance=0.0;
        this.hoursWorked=0.0;
        this.hourlyWage=0.0;
        this.moneyEarned=0.0;

    }

    public Employee(BankAccount bankAccount) {
     this.bankAccount=new BankAccount();
     this.balance=0.0;
     this.hoursWorked=0.0;
     this.hourlyWage=0.0;
     this.moneyEarned=0.0;

    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount=bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance=balance+amountToIncreaseBy;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        balance=balance-amountToDecreaseBy;

    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

        hoursWorked=hoursWorked+numberOfHours;
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
        return this.moneyEarned;

    }

}
