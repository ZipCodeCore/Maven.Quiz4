package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    private BankAccount bankAccount;
    private double hourlyWage;
    private double hoursWorked ;
    private double balace;

    public Employee(BankAccount bankAccount) {
       this.bankAccount = bankAccount;
       this.hourlyWage =35;
     }
    public Employee(){
        bankAccount = new BankAccount();
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;

    }
    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
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

    @Override
    public void setBalance(Double balance) {
        this.balace = balance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
     hoursWorked += numberOfHours;
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
        return  hourlyWage * hoursWorked;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
