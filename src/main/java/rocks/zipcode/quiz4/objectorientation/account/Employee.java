package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    private BankAccount bankAccount;
    private Double numberOfHoursWorked;
    private Double hourlyWage;

    public Employee() {
        this.bankAccount = new BankAccount();
        this.numberOfHoursWorked = 0.0;
        this.hourlyWage = 35.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.numberOfHoursWorked = 0.0;
        this.hourlyWage = 35.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
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
        return hourlyWage * numberOfHoursWorked;
    }
}
