package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    BankAccount bankAccount;
    private Double expectedHourlyWage = 35.0;
    private Double expectedHoursWorked = 0.0;
    private Double expectedBalance;
    private Double expectedBankAccountBalance;
    private Double numberOfHours;

    public Employee() {
        this.bankAccount = new BankAccount();
        this.expectedHourlyWage = 35.0;
        this.expectedHoursWorked = 0.0;
        this.expectedBalance = 0.0;
        this.expectedBankAccountBalance = 0.0;
        this.bankAccount.balance = 0.0;
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
        bankAccount.deposit(amountToIncreaseBy);
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
//        this.expectedHoursWorked =+ numberOfHours;
        this.expectedHoursWorked = (numberOfHours + this.expectedHoursWorked);
    }

    @Override
    public Double getHoursWorked() {
        System.out.println("->" + expectedHoursWorked);
        return this.expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.expectedHourlyWage * this.expectedHoursWorked;
    }


}
