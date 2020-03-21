package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    BankAccount bankAccount;
    Double hoursWorked;
    Double hourlyWage = 35.0;
    Double moneyEarned;

    public Employee() {

        this.bankAccount = new BankAccount();
        this.hoursWorked = 0.0;
        this.moneyEarned = 0.0;
    }

    public Employee(BankAccount bankAccount) {

        this.bankAccount = bankAccount;
        this.hoursWorked = 0.0;
        this.moneyEarned = 0.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked = hoursWorked+numberOfHours;
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
        return this.moneyEarned;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy < 0){
            throw new IllegalArgumentException();
        }
        else {
            this.bankAccount.deposit(amountToIncreaseBy);
        }

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(amountToDecreaseBy < 0){
            throw new IllegalArgumentException();
        }
        else {
            this.bankAccount.withdrawal(amountToDecreaseBy);
        }

    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }
}
