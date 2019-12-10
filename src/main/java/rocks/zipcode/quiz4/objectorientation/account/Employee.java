package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable {

    private Double balance;
    private BankAccount bankAccount;
    private Double hoursWorked;
    private Double hourlyWage;

    public Employee() {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.bankAccount = new BankAccount();
        this.balance = this.bankAccount.getBalance();
    }

    public Employee(BankAccount bankAccount) {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.bankAccount = bankAccount;
        this.balance = this.bankAccount.getBalance();
    }

    public BankAccount getBankAccount() {

        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        if (amountToIncreaseBy > 0) {
            this.balance = this.balance + amountToIncreaseBy;
            this.bankAccount.setBalance(this.balance);
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

    }

    @Override
    public Double getBalance() {
        return this.balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
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
