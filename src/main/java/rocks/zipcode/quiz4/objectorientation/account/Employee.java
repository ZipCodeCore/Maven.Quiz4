package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable, Worker{
    BankAccount bankAccount;
    Double hoursWorked;
    Double hourlyWage;

    public Employee() {
        bankAccount = new BankAccount();
        hourlyWage = 35.0;
        hoursWorked = 0.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        hourlyWage = 35.0;
        hoursWorked = 0.0;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked = hoursWorked + numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage * hoursWorked;
    }
}
