package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{


    private BankAccount bankAccount = new BankAccount();
    private Double expectedHourlyWage = 35.0;
    private Double expectedHoursWorked = 0.0;
    Double expectedBalance = 15.0;
    private Double expectedBankAccountBalance = expectedBalance;


    public Employee() {}

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
        expectedBankAccountBalance += amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        expectedBankAccountBalance -= amountToDecreaseBy;

    }

    @Override
    public Double getBalance() {
        return expectedBankAccountBalance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        expectedHoursWorked+= numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return expectedHoursWorked * expectedHourlyWage;
    }
}
