package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    Double hourlyWage;
    Double hoursWorked;
    Double balance;
    BankAccount bankAccount = new BankAccount();
    public Employee() {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        balance = 0.0;
        bankAccount.setBalance(0.0);;
    }

    public Employee(BankAccount bankAccount) {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        balance = 15.0;
        this.setBankAccount(bankAccount);
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount incbankAccount) {
        this.bankAccount = incbankAccount;
        this.balance = this.bankAccount.getBalance();
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance += amountToIncreaseBy;
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return balance;
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
        return hourlyWage*hoursWorked;
    }
}
