package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{

    private BankAccount bankAccount;
    private Double hoursWorked;
    private Double wage;

    public Employee() {
        this.bankAccount = new BankAccount();
        hoursWorked = 0.0;
        this.wage = 35.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        hoursWorked = 0.0;
        this.wage = 35.0;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount=bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked+=numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return wage;
    }

    @Override
    public Double getMoneyEarned() {
        return null;
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
}
