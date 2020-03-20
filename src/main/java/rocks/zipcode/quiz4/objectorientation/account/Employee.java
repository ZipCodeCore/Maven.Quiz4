package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker{
    private Double hoursWorked;
    private Double wage;
    private Double balance;
    private BankAccount bankAccount;
    public Employee() {

    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    public void deposit(Double amountToIncreaseBy) {

    }

    public void withdrawal(Double amountToDecreaseBy) {

    }

    public Double getBalance() {
        return null;
    }

    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked = numberOfHours;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public Double getHourlyWage() {
        return null;
    }

    public Double getMoneyEarned() {
        return null;
    }
}
