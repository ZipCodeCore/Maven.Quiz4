package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee {
    private BankAccount bankAccount;
    private Double hoursThatWasWorked;
    private Double moneyThatWasEarned;
    private Double hourlyWage;

    public Employee() {

    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hoursThatWasWorked = 0.0;
        this.moneyThatWasEarned = 0.0;
        this.hourlyWage = 35.0;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);

    }

    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);

    }

    public Double getBalance() {
        return bankAccount.getBalance();
    }

    public void increaseHoursWorked(Double numberOfHours) {
        moneyThatWasEarned += numberOfHours* hourlyWage;
        hoursThatWasWorked += numberOfHours;

    }

    public Double getHoursWorked() {
        return hoursThatWasWorked;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public Double getMoneyEarned() {
        return moneyThatWasEarned;
    }
}
