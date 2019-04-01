package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    BankAccount bankAccount;
    private Double expectedHourlyWage ;
    private Double expectedHoursWorked;
    private Double expectedBalance;
    private Double expectedBankAccountBalance = 0.0;

    public Employee() {
        this.bankAccount = new BankAccount();
        expectedHourlyWage = 35.0;
        expectedHoursWorked = 0.0;
        expectedBalance = 0.0;
        expectedBankAccountBalance = 0.0;
        bankAccount.balance = 0.0;
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

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

    }

    @Override
    public Double getBalance() {
        return bankAccount.balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

    }

    @Override
    public Double getHoursWorked() {
        return this.expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return null;
    }
}
