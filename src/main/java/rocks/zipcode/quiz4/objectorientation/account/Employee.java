package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    private BankAccount bankAccount;
    private Double hourlyWage;
    private Double hoursWorked;

    public Employee() {
//        this.bankAccount = new BankAccount();
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
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

    @Override
    public void deposit(Double amountToIncreaseBy) {
        getBankAccount().deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        getBankAccount().withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return getBankAccount().getBalance();
    }

}
