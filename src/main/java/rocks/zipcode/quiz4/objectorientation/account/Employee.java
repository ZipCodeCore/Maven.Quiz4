package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    BankAccount bankAccount;
    Double hoursWorked;
    Double hourlyWage;
    Double balance;


    public Employee() {
        this.hourlyWage = 0.0;
        this.hoursWorked = 0.0;
        this.bankAccount = new BankAccount();
        this.bankAccount.balance = 0.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = new BankAccount(bankAccount);
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
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
        return this.hoursWorked * this.hourlyWage;
    }


    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.bankAccount.balance += amountToIncreaseBy;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.bankAccount.balance -= amountToDecreaseBy;

    }

    @Override
    public Double getBalance() {
        return this.bankAccount.balance;
    }
}
