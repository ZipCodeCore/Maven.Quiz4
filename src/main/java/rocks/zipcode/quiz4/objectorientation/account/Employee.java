package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    Double hoursWorked;
    Double hourlyWage;
    BankAccount bankAccount;


    public Employee() {
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.bankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) { this.bankAccount = bankAccount; }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked = hoursWorked + numberOfHours;
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
        return hourlyWage * hoursWorked;
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
        return bankAccount.getBalance();
    }
}
