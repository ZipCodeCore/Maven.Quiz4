package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{
    private Double hoursWorked;
    private Double hourlyWage;
    private BankAccount account;

    public Employee() {
        hoursWorked = 0.0;
        hourlyWage = 35.0;
        account = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        hoursWorked = 0.0;
        hourlyWage = 35.0;
        account = bankAccount;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {
        account = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hoursWorked * hourlyWage;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        account.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        account.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return account.getBalance();
    }
}
