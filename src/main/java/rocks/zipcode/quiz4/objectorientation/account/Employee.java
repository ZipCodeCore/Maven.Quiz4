package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    private BankAccount bankAccount;
    private Double expectedHourlyWage;
    private Double expectedHoursWorked;
    private Double expectedBalance;
    private Double expectedBankAccountBalance;

    public Employee() {
        this.bankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    public Employee(BankAccount bankAccount, Double expectedHourlyWage, Double expectedHoursWorked,
                    Double expectedBalance, Double expectedBankAccountBalance) {
        this.bankAccount = bankAccount;
        this.expectedHourlyWage = expectedHourlyWage;
        this.expectedHoursWorked = expectedHoursWorked;
        this.expectedBalance = bankAccount.getBalance();
        this.expectedBankAccountBalance = expectedBankAccountBalance;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.setBalance(bankAccount.getBalance() + amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.setBalance(bankAccount.getBalance() - amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        expectedHoursWorked += numberOfHours;
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
        return bankAccount.getBalance();
    }
}
