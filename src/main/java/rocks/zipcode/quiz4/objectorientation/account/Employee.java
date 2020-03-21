package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    private double balance;
    private double hoursWorked;
    private double hourlyWage;
    private BankAccount bankAccount;

    public Employee() {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 0.0;
        this.bankAccount = new BankAccount();
        this.bankAccount.setBalance(balance);

    }

    public Employee(BankAccount bankAccount) {
        this.hourlyWage = 35.0;
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
        this.bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked = this.hoursWorked+numberOfHours;
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
        return this.hoursWorked*this.hourlyWage;
    }
}
