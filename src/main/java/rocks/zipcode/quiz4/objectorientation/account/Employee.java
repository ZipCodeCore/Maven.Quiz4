package rocks.zipcode.quiz4.objectorientation.account;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {

    private BankAccount bankAccount;
    private Double balance;
    private Double hoursWorked;
    private Double wage;
    private Double profit;

    public Employee(){

        this.bankAccount = new BankAccount();
        this.hoursWorked = 0.0;
        this.profit = 0.0;
    }

    public Employee(BankAccount bankAccount) {

        this.bankAccount = bankAccount;
        this.hoursWorked = 0.0;
        this.profit = 0.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance+=amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
            balance-=amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
            this.hoursWorked = numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.wage;
    }

    @Override
    public Double getMoneyEarned() {
        return getHoursWorked() * getHourlyWage();
    }
}
