package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker {

    private double hoursWorked;
    private double bankAccountBalance;
    private double hourlyWage;
    private double balance;
    private BankAccount bankAccount;

    public Employee() {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        balance = 0.0;
        bankAccountBalance = 0.0;
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
    public void increaseHoursWorked(Double numberOfHours) {

    }

    @Override
    public Double getHoursWorked() {
        return null;
    }

    @Override
    public Double getHourlyWage() {
        return null;
    }

    @Override
    public Double getMoneyEarned() {
        return null;
    }
}
