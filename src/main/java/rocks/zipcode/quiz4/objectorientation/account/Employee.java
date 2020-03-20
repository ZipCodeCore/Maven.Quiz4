package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee  implements Transactable, Worker{
    private BankAccount bankAccount;
    private Double hoursWorked;
    private Double moneyEarned;
    private Double hourlyWage;

    public Employee() {
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hoursWorked = 0d;
        this.moneyEarned = 0d;
        this.hourlyWage = 35.0;
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
        moneyEarned += numberOfHours*hourlyWage;
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
        return moneyEarned;
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
}