package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    BankAccount account;
    Double hoursWorked;
    Double wage;

    public Employee() {
        this.account = new BankAccount();
        this.wage = 35.00;
        this.hoursWorked = 0.0;
    }

    public Employee(BankAccount bankAccount) {
        this.account = bankAccount;
        this.wage = 35.00;
        this.hoursWorked = 0.0;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.account = bankAccount;
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
        return this.wage;
    }

    @Override
    public Double getMoneyEarned() {
        return hoursWorked*wage;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException{
        if(amountToIncreaseBy < 0 ){
            throw new IllegalArgumentException();
        }
        this.account.balance += amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException {
        this.account.balance -= amountToDecreaseBy;
        if(this.account.balance < 0){
            throw new IllegalArgumentException();
        }
    }


    @Override
    public Double getBalance() {
        return this.account.balance;
    }
}
