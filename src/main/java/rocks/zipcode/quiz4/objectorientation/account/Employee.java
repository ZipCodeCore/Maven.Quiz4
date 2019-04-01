package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    private BankAccount bankAccount;
    private Double hoursThatWasWorked;
    private Double moneyThatWasEarned;
    private Double hourlyWage;

    public Employee() {

    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hoursThatWasWorked = 0.0;
        this.moneyThatWasEarned = 0.0;
        this.hourlyWage = 35.0;
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
        bankAccount.withdrawal(amountToDecreaseBy);

    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        moneyThatWasEarned += numberOfHours* hourlyWage;
        hoursThatWasWorked += numberOfHours;


    }

    @Override
    public Double getHoursWorked() {
        return hoursThatWasWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return moneyThatWasEarned;
    }
}
