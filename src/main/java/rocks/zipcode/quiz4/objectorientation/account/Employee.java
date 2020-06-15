package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable, Worker {
    private BankAccount bankAccount;
    private Double numberOfHoursWorked;
    private Double hourlyWage;
    private Double moneyEarned;

    public Employee() {
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.numberOfHoursWorked = 0.0;
        this.hourlyWage = 35.0;
        this.moneyEarned = 0.0;
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
        numberOfHoursWorked += numberOfHours;
        moneyEarned += numberOfHours * hourlyWage;
    }

    @Override
    public Double getHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return moneyEarned;
    }
}
