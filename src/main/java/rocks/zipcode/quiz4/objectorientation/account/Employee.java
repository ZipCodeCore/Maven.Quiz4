package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable, Worker{

    private BankAccount myBankAccount;
    private Double hourlyWage;
    private Double hoursWorked;

    public Employee() {
        this.myBankAccount = new BankAccount();
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.00;
    }

    public Employee(BankAccount bankAccount) {
        this.myBankAccount = bankAccount;
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.00;
    }

    public BankAccount getBankAccount() {
        return this.myBankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.myBankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.myBankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.myBankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.myBankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.hourlyWage * this.hoursWorked;
    }
}
