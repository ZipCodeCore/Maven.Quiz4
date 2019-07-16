package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {

    BankAccount account;
    Double hours;
    Double wage;

    public Employee() {
        this.account = new BankAccount();
    }

    @Override
    public void deposit(Double increaseBy) {
        account.deposit(increaseBy);
    }

    @Override
    public void withdrawal(Double decreaseBy) {
        account.withdrawal(decreaseBy);
    }

    @Override
    public Double getBalance() {
        return account.getBalance();
    }

    @Override
    public BankAccount getBankAccount() {
        return this.account;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.account = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHoursWorkedSoFar) {
        this.hours += numberOfHoursWorkedSoFar;

    }

    @Override
    public Double getHoursWorked() {
        return hours;
    }

    @Override
    public Double getHourlyWage() {
        return wage * getHoursWorked();
    }
}