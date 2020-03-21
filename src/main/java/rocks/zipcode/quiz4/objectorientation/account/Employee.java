package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    private BankAccount bankAccount;

    Double expectedHourlyWage;
    Double expectedHoursWorked;
    Double expectedBalance;
    Double expectedBankAccountBalance;




    public Employee() {
        this.bankAccount = new BankAccount();
        this.expectedHourlyWage = 35.0;
        this.expectedHoursWorked = 0.0;
        this.expectedBalance = bankAccount.getBalance();
        this.expectedBankAccountBalance = bankAccount.getBalance();
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.expectedHourlyWage = 35.0;
        this.expectedHoursWorked = 0.0;
        this.expectedBalance = 15.0;
        this.expectedBankAccountBalance = expectedBalance;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
         Double balance = bankAccount.getBalance();
         balance += amountToIncreaseBy;
         bankAccount.setBalance(balance);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        Double balance = bankAccount.getBalance();
        balance = balance = amountToDecreaseBy;
        bankAccount.setBalance(balance);

    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.expectedHoursWorked += numberOfHours;

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
        return expectedHourlyWage * expectedHoursWorked;
    }
}
