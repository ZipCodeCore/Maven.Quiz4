package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable, Worker {
    private BankAccount bankAccount;
    private double numberOfHoursWorked;
    private double hourlyWage;

    public Employee() {
        this.bankAccount = new BankAccount();
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
        this.numberOfHoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.numberOfHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.numberOfHoursWorked * hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return getHourlyWage() * numberOfHoursWorked;
    }
}
