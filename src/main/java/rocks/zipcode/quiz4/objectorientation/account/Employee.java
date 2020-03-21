package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

    private BankAccount personalAccount;
    private Double numberOfHours;
    private Double hourlyWage;
    private Double moneyEarned;


    public Employee() {
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount) {
        this.personalAccount = bankAccount;
        this.hourlyWage = 35.0;
        this.numberOfHours =0.0;
        this.moneyEarned= 0.0;

    }

    public BankAccount getBankAccount() {

        return personalAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.personalAccount= bankAccount;

    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        personalAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        personalAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return personalAccount.getBalance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.numberOfHours += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return  numberOfHours;
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
