package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    BankAccount workAccount;
    Double hoursWorked;
    Double hourly;
    Double earned;

    public Employee() {
        this.workAccount = new BankAccount();
        this.hoursWorked = 0.0;
        this.hourly = 35.0;
        this.earned = 0.0;
    }

    public Employee(BankAccount bankAccount) {
        this.workAccount = bankAccount;
        this.hoursWorked = 0.0;
        this.hourly = 35.0;
        this.earned = 0.0;
    }

    public BankAccount getBankAccount() {
        return workAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.workAccount = bankAccount;
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
        return this.hourly;
    }

    @Override
    public Double getMoneyEarned() {
        return this.earned;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy < 0) {
            throw new IllegalArgumentException();
        } else {
            this.workAccount.setBalance(workAccount.getBalance() + amountToIncreaseBy);
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy < 0){
            throw new IllegalArgumentException();
        }
        this.workAccount.setBalance(workAccount.getBalance()-amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.workAccount.getBalance();
    }

    public BankAccount getWorkAccount() {
        return workAccount;
    }

    public void setWorkAccount(BankAccount workAccount) {
        this.workAccount = workAccount;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getHourly() {
        return hourly;
    }

    public void setHourly(Double hourly) {
        this.hourly = hourly;
    }

    public Double getEarned() {
        return earned;
    }

    public void setEarned(Double earned) {
        this.earned = earned;
    }
}
