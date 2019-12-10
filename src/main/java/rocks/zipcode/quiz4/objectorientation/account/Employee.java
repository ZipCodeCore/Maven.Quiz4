package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    BankAccount bankAccount;
    Double totalWorkHours;
    Double hourlyWage;

    public Employee() {
        this.bankAccount = new BankAccount();
        bankAccount.setBalance(0.0);
        this.totalWorkHours = 0.0;
        this.hourlyWage = 35.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.totalWorkHours = 0.0;
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
        this.totalWorkHours += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return totalWorkHours;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage * totalWorkHours;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }
}
