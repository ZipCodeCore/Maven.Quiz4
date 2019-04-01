package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee extends Account implements Transactable, Worker{
    private BankAccount bankAccount;
    private Double balance;
    private Double hours;

    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount= bankAccount;

    }

    public BankAccount getBankAccount() {

        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;


    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        double newBalance = balance + amountToIncreaseBy;
        balance = newBalance;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        double newBalance = balance -amountToDecreaseBy;
        balance = newBalance;

    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        double newHours = hours +numberOfHours;
        balance = newHours;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setNumberOfHours(Double numberOfHours) {
        this.hours = numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hours;
    }

    @Override
    public Double getHourlyWage() {
        return null;
    }

    @Override
    public Double getMoneyEarned() {
        return null;
    }
}
