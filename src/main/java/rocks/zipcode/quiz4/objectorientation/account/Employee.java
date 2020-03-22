package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    BankAccount bankAccount;
    Double hoursWorked;
    Double hourlyWage;

    public Employee() {
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount) {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
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
        hoursWorked += numberOfHours;
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
        return hourlyWage*hoursWorked;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.setBalance( bankAccount.getBalance() + amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.setBalance( bankAccount.getBalance() - amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }
}
