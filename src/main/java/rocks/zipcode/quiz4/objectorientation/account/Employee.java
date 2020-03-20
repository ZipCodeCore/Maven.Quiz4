package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    BankAccount bankAccount;
    Double hourlyWage;
    Double moneyEarned;
    Double hoursWorked;
    Double balance;
    Double bankAccountBalance;


    public Employee() {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        balance = 0.0;
        bankAccountBalance = 0.0;
        bankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        balance = 0.0;
        bankAccountBalance = 0.0;
    }

    public BankAccount getBankAccount() {
        //this.bankAccount.getBalance();
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Employee(BankAccount bankAccount, Double hourlyWage, Double hoursWorked, Double moneyEarned,  Double balance) {
        this.bankAccount = bankAccount;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.moneyEarned = moneyEarned;
        this.balance = balance;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException{
        if (amountToIncreaseBy < 0) {
            throw new IllegalArgumentException ();
        }
        else {
            balance = this.bankAccount.getBalance();
            balance += amountToIncreaseBy;
            bankAccount.setBalance(balance);
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException{
        balance = this.bankAccount.getBalance();
        System.out.println(balance);
        if (amountToDecreaseBy > balance || amountToDecreaseBy < 0) {
            throw new IllegalArgumentException();
        }
        else {
            balance -= amountToDecreaseBy;
            System.out.println(balance);
            bankAccount.setBalance(balance);
        }
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
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
        return moneyEarned;
    }
}
