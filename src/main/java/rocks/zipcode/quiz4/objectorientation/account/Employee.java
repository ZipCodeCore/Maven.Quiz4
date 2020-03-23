package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    private BankAccount account;
    private Double hourlyWage = 35.0;
    private Double hoursWorked = 0.0;

    public Employee() {
        account = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        account = bankAccount;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {
        account = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        account.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        account.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return account.getBalance();
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
        return hoursWorked * hourlyWage;
    }
}
