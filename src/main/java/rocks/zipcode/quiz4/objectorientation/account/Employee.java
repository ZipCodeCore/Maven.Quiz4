package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    private Double HourlyWage;
    private Double HoursWorked;
    private BankAccount account;

    public Employee() {
        HourlyWage = 35.0;
        HoursWorked = 0.0;
        account = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        HourlyWage = 35.0;
        HoursWorked = 0.0;
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
        this.HoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.HoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.HourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.HourlyWage * this.HoursWorked;
    }
}
