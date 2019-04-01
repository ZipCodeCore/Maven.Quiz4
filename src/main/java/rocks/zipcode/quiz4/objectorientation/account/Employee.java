package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{

    private BankAccount bankAcct;
    private Double hoursWorked;
    private Double hourlyWage;
    private Double moneyEarned;


//    Double expectedHourlyWage = 35.0;
//    Double expectedHoursWorked = 0.0;
//    Double expectedBalance = 0.0;
//    Double expectedBankAccountBalance = 0.0;

    public Employee() {
        this.bankAcct = new BankAccount();
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;

    }

    public Employee(BankAccount bankAccount) {
        this.bankAcct = bankAccount;
        this.hourlyWage = 35.00;
        this.hoursWorked = 0.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAcct;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAcct = bankAccount;

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
        return this.moneyEarned;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAcct.setBalance(bankAcct.getBalance()+amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
    bankAcct.setBalance(bankAcct.getBalance()-amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAcct.getBalance();
    }
}
